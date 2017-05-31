package uni.iit.miskolc.lukacs6.ApplicationRegistry.Service;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.exception.UserNotExistsException;

public interface UserService {

	User getUserByNeptunCode(String neptuncode) throws UserNotExistsException;
	void modifyUser(String neptuncode, String firstname, String lastname, int age, String email) throws UserNotExistsException;

	
	
}
