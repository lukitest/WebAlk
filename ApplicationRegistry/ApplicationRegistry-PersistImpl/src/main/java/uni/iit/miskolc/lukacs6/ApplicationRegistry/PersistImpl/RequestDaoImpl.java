package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Request;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.RequestDao;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidRequestException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidUserException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.converter.*;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity.TemplateEntity;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity.RequestEntity;

@Repository
@Transactional
public class RequestDaoImpl implements RequestDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void submitRequest(Request request) throws InvalidRequestException {
RequestEntity requestEntity = new RequestEntity();
		
		requestEntity.setUser(UserEntityConverter.convertUserToEntity(request.getUser()));
		//requestEntity.setTemplate(TemplateEntityConverter.convertTemplateToEntity(request.getTemplate());
		
		requestEntity.setComment(request.getComment());
		requestEntity.setStatus(request.getStatus());
		
		this.entityManager.persist(requestEntity);
		
	}

	@Override
	public List<Request> listRequestByUser(User user) throws InvalidUserException, InvalidRequestException {
		String select = "SELECT r FROM Request r WHERE r.user.neptuncode = :neptuncode";
		TypedQuery<RequestEntity> query = this.entityManager.createQuery(select, RequestEntity.class);
		query.setParameter("neptuncode", user.getNeptuncode());
		
		List<RequestEntity> requestEntities = query.getResultList();
		
		return RequestEntityConverter.convertRequestEntitiesToModels(requestEntities);
	}

	@Override
	public void addComment(Request request, String newComment) throws InvalidRequestException {
		RequestEntity requestEntity = this.entityManager.find(RequestEntity.class, request.getId());
		requestEntity.setComment(newComment);

	}

	@Override
	public List<Request> listRequestByComment(String comment) throws InvalidRequestException {
		String select = "SELECT r FROM Request r WHERE r.comment = :comment";
		TypedQuery<RequestEntity> query = this.entityManager.createQuery(select, RequestEntity.class);
		query.setParameter("comment", comment);
		
		List<RequestEntity> requestEntities = query.getResultList();
		
		return RequestEntityConverter.convertRequestEntitiesToModels(requestEntities);
	}

	@Override
	public void makeVerdict(Request request, String verdict) throws InvalidRequestException {
		RequestEntity requestEntity = this.entityManager.find(RequestEntity.class, request.getId());
		requestEntity.setStatus(verdict);
	}

	@Override
	public void forwardRequest(User destinaionUser, Request request)
			throws InvalidRequestException, InvalidUserException {
		RequestEntity requestEntity = this.entityManager.find(RequestEntity.class, request.getId());
		//requestEntity.setUser(UserEntityConverter.convertUserToEntity(destinaionUser));
	}

	@Override
	public Request requestById(int id) {
		RequestEntity requestEntity = this.entityManager.find(RequestEntity.class, id);
	
		return RequestEntityConverter.convertRequestEntityToModel(requestEntity);
	}

}
