package com.mdoner.projects.book.rest;


import com.mdoner.projects.data.BookDTO;
import com.mdoner.projects.ports.BookServicePort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    private final BookServicePort bookServicePort;

    public BookController(@Qualifier("getBookServicePortBean") BookServicePort bookServicePort) {
        this.bookServicePort = bookServicePort;
    }

    @PostMapping("/add")
    public BookDTO addBook(@RequestBody BookDTO bookDTO) {
        return bookServicePort.addBook(bookDTO);
    }

    @PutMapping("/update")
    public BookDTO updateBook(@RequestBody BookDTO bookDTO) {
        return bookServicePort.updateBook(bookDTO);
    }

    @GetMapping("/get/{id}")
    public BookDTO getBookByID(@PathVariable long id) {
        return bookServicePort.getBookById(id);
    }

    @GetMapping("/get")
    public List<BookDTO> getAllBooks() {
        return bookServicePort.getBooks();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBookByID(@PathVariable long id) {
        bookServicePort.deleteBookById(id);
    }
}
