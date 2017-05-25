package uni.iit.miskolc.lukacs6.ApplicationRegistry.Service;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.exception.UserNotExistsException;

public interface UserService {

	User getUserByLoginDatas(String neptuncode) throws UserNotExistsException;
	
	
}
