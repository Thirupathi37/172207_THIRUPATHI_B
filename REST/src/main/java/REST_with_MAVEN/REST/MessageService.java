package REST_with_MAVEN.REST;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService 
{
	
	private  Map<Long,Message1> messages=DatebaseClass.getmasseges();
	 
	public MessageService()
	{
		messages.put(11,(new Message1(1,"HelloWorld","THIRU"));
	}
	
	public List<Message1> getAllMessages()
	{
		return new ArrayList<Message1> (messages.values());
	}
	
	public Message1 getMessage(long id)
	{
		return 	messages.get(id);
	}
	
	public Message1 addMessage(Message1 message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message1 updateMessage(Message1 message)
	{
		if(message.getId()<=0)
		{
			return null;
		}
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message1 removeMessage(long id)
	{
		return messages.remove(id);
	}
}
