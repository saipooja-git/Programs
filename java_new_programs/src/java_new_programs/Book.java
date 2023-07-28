package java_new_programs;

import java.util.ArrayList;

public class Book {
	//state
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();
	//constructor or creating the way you ant it to
	public Book(int id,String name,String author) {
		this.id=id;
		this.name=name;
		this.author=author;
	}
	//operations
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	public String toString() {
		return String.format("id = %d,name = %s,author = %s,Reviews = %s",id,name,author,reviews);
	}
}
