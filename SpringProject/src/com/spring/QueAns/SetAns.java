package com.spring.QueAns;

import java.util.List;
import java.util.Set;

public class SetAns
{
	Set<Question> answer;

	public SetAns(Set<Question> answer)
	{
		super();
		this.answer = answer;
	}

	public SetAns() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Set<Question> getAnswer() {
		return answer;
	}

	
	public void setAnswer(Set<Question> answer) {
		this.answer = answer;
	}

	public void displaySet()
	{
		System.out.println("==========FROM SET==========");
		for(Question q:answer)
		{
			System.out.println(q.getQuestionId()+"   "+q.getQuestion()+"   "+q.getAnswers());
		}
	}
	
	

	
	
	
	
}
