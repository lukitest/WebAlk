package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "User")
@Table(name = "Users")
public class UserEntity {

	@Id
	@Column(name = "Neptuncode")
	private String neptuncode;

	@Column(name = "Password")
	private String password;

	@Column(name = "Firstname")
	private String firstname;

	@Column(name = "Lastname")
	private String lastname;

	@Column(name = "Age")
	private int age;

	@Column(name = "Email")
	private String email;

	@Column(name = "isTeacher")
	private boolean isTeacher;

	@Column(name = "Enabled")
	private boolean enabled;

	public UserEntity() {

	}

	public String getNeptuncode() {
		return neptuncode;
	}

	public void setNeptuncode(String neptuncode) {
		this.neptuncode = neptuncode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTeacher() {
		return isTeacher;
	}

	public void setTeacher(boolean isTeacher) {
		this.isTeacher = isTeacher;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
