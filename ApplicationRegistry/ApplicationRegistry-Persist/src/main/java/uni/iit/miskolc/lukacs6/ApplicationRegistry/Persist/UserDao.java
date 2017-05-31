package uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidUserException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;



public interface UserDao {

	User getUserByNeptunCode(String neptuncode) throws InvalidUserException;
	
	void modifyUser(String neptuncode, String firstname, String lastname, int age, String email) throws InvalidUserException;
	
	
}
