package uni.iit.miskolc.lukacs6.ApplicationRegistry.Model;

public class User {
	
	private String neptuncode;
	private String password;
	private String firstname;
	private String lastname;
	private int age;
	private String email;
	private boolean isTeacher;
	private boolean enabled;
	
	public User(){
		
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isTeacher() {
		return isTeacher;
	}

	public void setTeacher(boolean isTeacher) {
		this.isTeacher = isTeacher;
	}

}
