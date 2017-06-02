package uni.iit.miskolc.lukacs6.ApplicationRegistry.PersistImpl.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "UserID")
	private UserEntity user;
	@Id
	@Column(name = "Status")
	private String status;
	@Id
	@Column(name = "Comment")
	private String comment;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TemplateTitle")
	private TemplateEntity template;
	@Id
	@Column(name = "Verdict")
	private String verdict;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public TemplateEntity getTemplate() {
		return template;
	}

	public void setTemplate(TemplateEntity template) {
		this.template = template;
	}

	public String getVerdict() {
		return verdict;
	}

	public void setVerdict(String verdict) {
		this.verdict = verdict;
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

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
