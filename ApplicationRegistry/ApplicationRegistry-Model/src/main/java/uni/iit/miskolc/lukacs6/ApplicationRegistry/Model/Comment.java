package uni.iit.miskolc.lukacs6.ApplicationRegistry.Model;

public class Comment {
	
	private String comment;
	private Request request;
	@Override
	public String toString() {
		return comment;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
}
