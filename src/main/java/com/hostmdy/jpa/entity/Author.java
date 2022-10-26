package com.hostmdy.jpa.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer authorId;
	
	private String firstname;
	private String lastname;
	private Integer age;
	private String email;
	
	@ManyToMany(mappedBy = "authors")
	private Set<Book> books = new HashSet<>();
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	public Author(String firstname, String lastname, Integer age, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
	}
	
	

	

	public Set<Book> getBooks() {
		return books;
	}





	public void setBooks(Set<Book> books) {
		this.books = books;
	}





	public Integer getAuthorId() {
		return authorId;
	}



	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", email=" + email + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(authorId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(authorId, other.authorId);
	}

	
	
	
}
