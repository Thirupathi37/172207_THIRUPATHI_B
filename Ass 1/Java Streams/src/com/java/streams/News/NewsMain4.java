package com.java.streams.News;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.streams.News.News;

public class NewsMain4
{

	public static void main(String[] args)
	{	List<News> list=new ArrayList<>();
	
	list.add(new News(11,"xyz","The budget of TS will start by next month","Yeah True"));
	list.add(new News(22,"abc","KCR has been won in recent elections","Good Leader "));
	list.add(new News(33,"def","Tollywood","Telugu budget"));
	list.add(new News(44,"xyz","budget","The budget is 23LAKH CRORES "));
	list.add(new News(55,"xyz","sports","First IPL mmatch is between CSK and RCB"));
	list.add(new News(66,"xyz","budget","The budget is an vote on acccount"));
		
Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));

		

		long maxval=(Collections.max(map.values()));

		for(java.util.Map.Entry<Object, Long> entry:map.entrySet()) {

		if(entry.getValue()==maxval) {

		System.out.println(entry.getKey());

		}	
		
		}
        }
}
	
	
