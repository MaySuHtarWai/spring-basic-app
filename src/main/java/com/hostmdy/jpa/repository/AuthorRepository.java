package com.hostmdy.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.hostmdy.jpa.entity.Author;

public interface AuthorRepository  extends CrudRepository<Author, Integer>{

}
