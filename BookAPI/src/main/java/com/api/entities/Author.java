package com.api.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="authorxyz")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="author_id", nullable=false)
	private int authorId;
	
	private String name;
	
	private String qualification;
	
	@ManyToOne(cascade = CascadeType.ALL, optional=false)
	public Book book;

	public Author(int authorId, String name, String qualification) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.qualification = qualification;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Author() {
		super();	
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", qualification=" + qualification + "]";
	}
}