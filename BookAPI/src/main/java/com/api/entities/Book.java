package com.api.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookss")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="book_id")
	private int BookId;
	private String name;
	private int price;
	private String publication;
	private String createdDate;
	private String lastUpdateDate;
	private int AuthorId;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "BookId")
//	private List<Author> author;
//	
//	
//	public List<Author> getAuthor() {
//		return author;
//	}
//	public void setAuthor(List<Author> author) {
//		this.author = author;
//	}
	
	public Book(int bookId, String name, int price, String publication, String createdDate, String lastUpdateDate,
			int authorId, List<Author> author) {
		super();
		BookId = bookId;
		this.name = name;
		this.price = price;
		this.publication = publication;
		this.createdDate = createdDate;
		this.lastUpdateDate = lastUpdateDate;
		AuthorId = authorId;
//		this.author = author;
	}

	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public int getAuthorId() {
		return AuthorId;
	}
	public void setAuthorId(int authorId) {
		AuthorId = authorId;
	}
	public Book() {
		super();	
	}
	
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", name=" + name + ", price=" + price + ", publication=" + publication
				+ ", createdDate=" + createdDate + ", lastUpdateDate=" + lastUpdateDate + ", AuthorId=" + AuthorId
				+ "]";
	}
}
