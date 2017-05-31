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
	@Column(name = "Status")
	private String status;
	@Id
	@Column(name = "Comment")
	private String comment;
	@Id
	@Column(name = "Template")
	private TemplateEntity template;
	@Id
	@Column(name = "Verdict")
	private String verdict;
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
