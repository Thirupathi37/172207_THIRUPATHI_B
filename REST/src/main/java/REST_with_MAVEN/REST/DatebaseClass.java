package REST_with_MAVEN.REST;

import java.util.HashMap;
import java.util.Map;




public class DatebaseClass 
{

	private static Map<Long,Message1> messages=new HashMap<>();
	private static Map<Long,Profile> profiles=new HashMap<>();

	public static Map<Long,Message1> getmasseges()
	{
		return messages;
	}
	
	
	public static Map<Long,Profile> getProfiles()
	{
		return profiles;
	}
	
}
