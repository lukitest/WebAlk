package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Request")
@Table(name = "Requests")
public class RequestEntity {
	@Id
	@Column(name = "Id")
	private int id;
	@Id
	@Column(name = "Date")
	private Date date;
	@Id
	@Column(name = "User")
	private String user;
	@Id
	@Column(name = "Reviewer")
	private String reviewer;
	
	
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
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getReviewer() {
		return reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}
	
}
