package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.UserDao;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Persist.exception.InvalidUserException;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.converter.UserEntityConverter;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity.UserEntity;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	public UserDaoImpl() {

	}

	@Override
	public User getUserByUsername(String neptuncode) throws InvalidUserException {
		UserEntity userEntity = this.entityManager.find(UserEntity.class, neptuncode);
		User user = null;

		if (userEntity != null) {
			user = UserEntityConverter.convertUserEntityToModel(userEntity);
		} else {
			throw new InvalidUserException();
		}

		return user;
	}

	@Override
	public void modifyUser(String neptuncode, String firstname, String lastname, int age, String email)
			throws InvalidUserException {
		UserEntity userEntity = this.entityManager.find(UserEntity.class, neptuncode);

		if (userEntity != null) {
			userEntity.setFirstname(firstname);
			userEntity.setLastname(lastname);
			userEntity.setAge(age);
			userEntity.setEmail(email);		

			this.entityManager.merge(userEntity);
		} else {
			throw new InvalidUserException();
		}

	}

	

}
