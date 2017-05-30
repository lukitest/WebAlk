package uni.iit.miskolc.lukacs6.ApplicationRegistry.Service;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.exception.UserNotExistsException;

public interface UserService {

	
	void modifyUser(String neptuncode, String firstname, String lastname, int age, String email) throws UserNotExistsException;

	User getUserByUsername(String neptuncode) throws UserNotExistsException;
	
}
