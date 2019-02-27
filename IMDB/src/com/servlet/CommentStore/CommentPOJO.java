package com.servlet.CommentStore;

public class CommentPOJO 
{

	String comment;

	public CommentPOJO(String comment) {
		super();
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "CommentPOJO [comment=" + comment + "]";
	}
	
	
}
