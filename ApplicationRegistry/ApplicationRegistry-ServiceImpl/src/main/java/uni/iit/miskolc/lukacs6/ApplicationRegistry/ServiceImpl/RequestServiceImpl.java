package uni.iit.miskolc.lukacs6.ApplicationRegistry.ServiceImpl;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Request;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.RequestDao;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.UserDao;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidRequestException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidTemplateException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidUserException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.RequestService;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.TemplateService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class RequestServiceImpl implements RequestService {
	
	@Autowired
	private RequestDao requestDao;
	
	@Autowired 
	private UserDao userDao;
	
	@Autowired
	private TemplateService templateService; 
	
	
	

	@Override
	public void submitRequest(String neptuncode, String title)
			throws InvalidRequestException, InvalidUserException, InvalidTemplateException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Request> listRequestByUser(String neptuncode) throws InvalidUserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addComment(int requestId, String newComment) throws InvalidRequestException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Request> listRequestByComment(String comment) throws InvalidRequestException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeVerdict(int requestId, String newStatus) throws InvalidRequestException {
		// TODO Auto-generated method stub

	}

	@Override
	public void forwardRequest(String neptuncode, int requestId) throws InvalidRequestException, InvalidUserException {
		// TODO Auto-generated method stub

	}

}
