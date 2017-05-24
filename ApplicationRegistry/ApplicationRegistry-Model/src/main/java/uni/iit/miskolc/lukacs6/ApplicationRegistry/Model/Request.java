package uni.iit.miskolc.lukacs6.ApplicationRegistry.Model;

import java.util.Date;

public class Request {

	private int id;
	private Date date;
	private Template template;

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

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

}
