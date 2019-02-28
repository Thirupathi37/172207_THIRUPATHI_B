package com.imdb.Rating;

public class RatingPojo
{
  String rating;

public RatingPojo(String rating) {
	super();
	this.rating = rating;
}

public String getRating() {
	return rating;
}

public void setRating(String rating) {
	this.rating = rating;
}

@Override
public String toString() {
	return "RatingPojo [rating=" + rating + "]";
}
  
  
}
