package uni.iit.miskolc.lukacs6.ApplicationRegistry.ServiceImpl;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.UserService;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Service.exception.UserNotExistsException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.UserDao;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidUserException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public UserServiceImpl(){}
	


	@Override
	public void modifyUser(String neptuncode, String firstname, String lastname, int age, String email)
			throws UserNotExistsException {
		try {
			this.userDao.modifyUser(neptuncode, firstname, lastname, age, email);
		} catch (InvalidUserException e) {
			throw new UserNotExistsException();
		}
	}

	@Override
	public User getUserByNeptunCode(String neptuncode) throws UserNotExistsException {
		User user = null;

		try {
			user = this.userDao.getUserByNeptunCode(neptuncode);
		} catch (InvalidUserException e) {
			throw new UserNotExistsException();
		}

		return user;
	}

}
