package com.java.streams.News;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewsMain6 
{
	public static void main(String[] args)
	{	List<News> list=new ArrayList<>();
	
	list.add(new News(11,"xyz","The budget of TS will start by next month","Yeah True"));
	list.add(new News(22,"abc","KCR has been won in recent elections","Good Leader "));
	list.add(new News(33,"def","Tollywood","Telugu budget"));
	list.add(new News(44,"xyz","budget","The budget is 23LAKH CRORES "));
	list.add(new News(55,"xyz","sports","First IPL mmatch is between CSK and RCB"));
	list.add(new News(66,"xyz","budget","The budget is an vote on acccount"));
		
	
	Map<Object, Long> map1 = list.stream().collect(Collectors.groupingBy(News::getPostedByUser, Collectors.counting()));
	long maxval1=(Collections.max(map1.values()));
	for(java.util.Map.Entry<Object, Long> entry1:map1.entrySet()) 
	{

		if(entry1.getValue()==maxval1) 
		{

		System.out.println(entry1.getKey());
		
		}	
		
    }
}
}
