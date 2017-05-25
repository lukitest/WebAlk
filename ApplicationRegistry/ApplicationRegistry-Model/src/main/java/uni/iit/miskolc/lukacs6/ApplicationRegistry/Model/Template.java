package uni.iit.miskolc.lukacs6.ApplicationRegistry.Model;

public enum Template {
	DIRECTOR("DIRECTOR"),
	DEPARTMENT("DEPARTMENT"),
	RECTOR("RECTOR"),
	LECTURER("LECTURER");

	private String value;
	private Template(String destination) {
		this.value = destination;
	}
	@Override
	public String toString() {
		return value;
	}
	public void setTemplate(String destination) {
		this.value = destination;
	}

}
