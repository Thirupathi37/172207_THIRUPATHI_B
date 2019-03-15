package REST_with_MAVEN.REST;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Message1 
{

	private long id;
	private String message;
	private Date created;
	private String author;
	
	public Message1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message1(long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.created = created;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
