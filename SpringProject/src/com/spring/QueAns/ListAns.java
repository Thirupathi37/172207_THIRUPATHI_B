package com.spring.QueAns;

import java.util.List;

public class ListAns 
{
	List<Question> answer;

	public ListAns(List<Question> answer)
	{
		super();
		this.answer = answer;
	}

	public ListAns() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public List<Question> getAnswer() {
		return answer;
	}

	
	public void setAnswer(List<Question> answer) {
		this.answer = answer;
	}

	public void displayList()
	{
		System.out.println("==========FROM LIST==========");
		for(Question q:answer)
		{
			System.out.println(q.getQuestionId()+"   "+q.getQuestion()+"   "+q.getAnswers());
		}
	}
	
	

	
	
}
