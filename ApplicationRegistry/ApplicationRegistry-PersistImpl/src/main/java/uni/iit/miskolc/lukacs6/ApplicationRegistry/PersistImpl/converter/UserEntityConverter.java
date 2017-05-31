package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.converter;

import uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity.UserEntity;
import uni.iit.miskolc.lukacs6.ApplicationRegistry.Model.User;

public final class UserEntityConverter {

	private UserEntityConverter() {
	}

	public static User convertUserEntityToModel(UserEntity userEntity) {
		User user = new User();
		user.setNeptuncode(userEntity.getNeptuncode());
		user.setPassword(userEntity.getPassword());
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
	public static UserEntity convertUserToEntity(User user) {
		UserEntity userEntity = new UserEntity();
		userEntity.setNeptuncode(user.getNeptuncode());
		userEntity.setPassword(user.getPassword());
		userEntity.setAge(user.getAge());
		userEntity.setEmail(user.getEmail());
		userEntity.setFirstname(user.getFirstname());
		userEntity.setLastname(user.getLastname());
		userEntity.setNeptuncode(user.getNeptuncode());
		userEntity.setPassword(user.getPassword());
		userEntity.setTeacher(user.isTeacher());
		userEntity.setEnabled(user.isEnabled());

		return userEntity;
	}

	


}
