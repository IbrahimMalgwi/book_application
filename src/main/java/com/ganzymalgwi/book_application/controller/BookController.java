package com.ganzymalgwi.book_application.controller;

import com.ganzymalgwi.book_application.entity.Book;
import com.ganzymalgwi.book_application.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/getBook{bookName}")
    public ResponseEntity<Book> getBook(@PathVariable("bookName") String name) {
        Book bookByName = bookService.getBookName(name);
        return ResponseEntity.ok(bookByName);
    }

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        Book updatedBook = bookService.updateBook(book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/deleteBook{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") Integer id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}
