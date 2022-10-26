package com.hostmdy.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.hostmdy.jpa.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
