package com.ganzymalgwi.book_application.repository;

import com.ganzymalgwi.book_application.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{
    public Book findByTitle(String name);


}
