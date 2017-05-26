package uni.iit.miskolc.lukacs6.ApplicationRegistry.Model;

import java.util.Date;

public class Request {

	private int id;
	private Date date;
	private String user;
	private String reviewer;
	
	
	public Request() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	

}
