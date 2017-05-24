package uni.iit.miskolc.lukacs6.ApplicationRegistry.Model;

public class Verdict {

	private Request request;
	private String verdict;

	public Verdict() {
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public String getVerdict() {
		return verdict;
	}

	public void setVerdict(String verdict) {
		this.verdict = verdict;
	}

}
