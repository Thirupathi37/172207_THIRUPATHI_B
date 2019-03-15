package com.spring.QueAns;

import java.util.Iterator;
import java.util.Map;

public class MapAns 
{
Map<String,String> answer;

public MapAns() {
	super();
	// TODO Auto-generated constructor stub
}

public MapAns(Map<String, String> answer) {
	super();
	this.answer = answer;
}

public Map<String, String> getAnswer() {
	return answer;
}

public void setAnswer(Map<String, String> answer) {
	this.answer = answer;
}

public void displayMap()
{
	System.out.println("==========FROM MAP==========");
	
	Iterator<Map.Entry<String, String>> itr = answer.entrySet().iterator(); 
    
    while(itr.hasNext()) 
    { 
         Map.Entry<String, String> entry = itr.next();
		System.out.println("(Question)"+entry.getKey()+"(Answer) " +entry.getValue());
	}
    
}




	
}
