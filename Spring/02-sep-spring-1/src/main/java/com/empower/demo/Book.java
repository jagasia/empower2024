package com.empower.demo;

import java.util.List;

public class Book {
	private Integer id;
	private String title;
	private List<Author> authors;
	
	public Book() {}

	public Book(Integer id, String title, List<Author> authors) {
		super();
		this.id = id;
		this.title = title;
		this.authors = authors;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authors=" + authors + "]";
	}
	
	
}
