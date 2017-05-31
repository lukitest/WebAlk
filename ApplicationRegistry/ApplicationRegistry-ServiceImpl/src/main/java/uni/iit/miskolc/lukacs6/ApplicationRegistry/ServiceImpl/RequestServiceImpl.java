package uni.iit.miskolc.lukacs6.ApplicationRegistry.ServiceImpl;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Request;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Template;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.RequestDao;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.UserDao;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidRequestException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidTemplateException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidUserException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.RequestService;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.TemplateService;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.UserService;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.exception.UserNotExistsException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class RequestServiceImpl implements RequestService {
	
	@Autowired
	private RequestDao requestDao;
	
	@Autowired 
	private UserService userService;
	
	@Autowired
	private TemplateService templateService; 
	
	
	

	@Override
	public void submitRequest(String neptuncode, String title)
			throws InvalidRequestException, InvalidUserException, InvalidTemplateException, UserNotExistsException {
		User user = this.userService.getUserByNeptunCode(neptuncode);
		Template template = this.templateService.getTemplateByTitle(title);
		
		Request request = new Request();
		request.setUser(user);
		request.setTemplate(template);
		request.setStatus("SENT");
		
		this.requestDao.submitRequest(request);;
	}

	@Override
	public List<Request> listRequestByUser(String neptuncode) throws InvalidUserException, UserNotExistsException {
		User user = this.userService.getUserByNeptunCode(neptuncode);
		try {
			return this.requestDao.listRequestByUser(user);
		} catch (InvalidRequestException e) {
			throw new InvalidUserException();
		}
	}
	
	

	@Override
	public void addComment(int requestId, String newComment) throws InvalidRequestException {
		Request request = this.requestDao.requestById(requestId);
		this.requestDao.addComment(request, newComment);

	}

	@Override
	public List<Request> listRequestByComment(String comment) throws InvalidRequestException {
		return this.requestDao.listRequestByComment(comment);
		
	}

	@Override
	public void makeVerdict(int requestId, String newStatus) throws InvalidRequestException {
		Request request = this.requestDao.requestById(requestId);
		this.requestDao.makeVerdict(request, newStatus);

	}

	@Override
	public void forwardRequest(String neptuncode, int requestId) throws InvalidRequestException, InvalidUserException, UserNotExistsException {
		User destinationUser = this.userService.getUserByNeptunCode(neptuncode);
		Request request = this.requestDao.requestById(requestId);

	}

}
