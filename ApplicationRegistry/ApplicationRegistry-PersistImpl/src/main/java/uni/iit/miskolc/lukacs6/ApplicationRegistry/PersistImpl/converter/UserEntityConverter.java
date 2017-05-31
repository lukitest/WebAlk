package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.converter;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity.UserEntity;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;

public final class UserEntityConverter {

	private UserEntityConverter() {
	}

	public static User convertUserEntityToModel(UserEntity userEntity) {
		User user = new User();
		user.setAge(userEntity.getAge());
		user.setEmail(userEntity.getEmail());
		user.setFirstname(userEntity.getFirstname());
		user.setLastname(userEntity.getLastname());
		user.setNeptuncode(userEntity.getNeptuncode());
		user.setPassword(userEntity.getPassword());
		user.setTeacher(userEntity.isTeacher());
		user.setEnabled(userEntity.isEnabled());

		return user;
	}
}
