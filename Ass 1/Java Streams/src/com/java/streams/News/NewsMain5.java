package com.java.streams.News;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class NewsMain5 {

	public static void main(String[] args) {
		
			List<News> list=new ArrayList<>();
			
			list.add(new News(11,"xyz","The budget of TS will start by next month","Yeah True"));
			list.add(new News(22,"abc","KCR has been won in recent elections","Good Leader "));
			list.add(new News(33,"def","Tollywood","Telugu budget"));
			list.add(new News(44,"xyz","budget","The budget is 23LAKH CRORES "));
			list.add(new News(55,"xyz","sports","First IPL mmatch is between CSK and RCB"));
			list.add(new News(66,"xyz","budget","The budget is an vote on acccount"));
			//->nPredicate<String> p= n->n.contentEquals("budget");
			
		List list1=list.stream().filter(n->n.getComment().contains("budget")).collect(Collectors.toList());
		long l=list1.stream().count();
		
		System.out.println("The word budget in comments"+l);
		System.out.println("-------------------------------------------");
		//List<News> list2=list.stream().filter(n->n.getNewsId()).collect(Collectors.toList());
		
			
			

	}

}