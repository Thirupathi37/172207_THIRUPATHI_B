package REST_with_MAVEN.REST;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("messages")
public class MessageResource {

	
	MessageService ms=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message1> getMessage()
	{
		return ms.getAllMessages(); 	  	
	}
}
