package uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist;
import java.util.List;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.Request;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidUserException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidRequestException;

public interface RequestDao {
	
	void submitRequest(Request request) throws InvalidRequestException;
	List<Request> listRequestByUser(User user) throws InvalidUserException, InvalidRequestException;
	
	void addComment(Request request, String newComment) throws InvalidRequestException;
	List<Request> listRequestByComment(User comment) throws  InvalidRequestException;

	void makeVerdict(Request request, String verdict) throws InvalidRequestException;
	void forwardRequest(User destinaionUser, Request request) throws InvalidRequestException, InvalidUserException;
	
	Request requestById(int id);
	
}
