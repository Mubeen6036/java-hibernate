package domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="isbn")
	private String isbn;
	@Column(name="Book_name")
	private String name;
//	private Publisher publisher;
//	private List<Chapter> chapters;
	
	public Book() {}
	public Book(String isbn, String name) {
		this.isbn = isbn;
		this.name = name;
//		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Publisher getPublisher() {
//		return publisher;
//	}
//	public void setPublisher(Publisher publisher) {
//		this.publisher = publisher;
//	}
//	public List<Chapter> getChapters() {
//		return chapters;
//	}
//	public void setChapters(List<Chapter> chapters) {
//		this.chapters = chapters;
//	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publisher="
				 + ", chapters="  + "]";
	}
}












































