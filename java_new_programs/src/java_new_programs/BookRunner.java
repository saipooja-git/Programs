package java_new_programs;
public class BookRunner {

	public static void main(String[] args) {

	
		Book book = new Book(123, "RichDad vs PoorDad","RobertKiyosaki" );
		book.addReview(new Review(10,"Greatone",5));
		book.addReview(new Review(123,"Good",5));
		System.out.println(book);
		
	}

}
