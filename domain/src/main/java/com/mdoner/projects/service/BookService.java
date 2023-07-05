package com.mdoner.projects.service;


import com.mdoner.projects.data.BookDTO;
import com.mdoner.projects.ports.BookPersistencePort;
import com.mdoner.projects.ports.BookServicePort;

import java.util.List;

public class BookService implements BookServicePort {

    private final BookPersistencePort bookPersistencePort;

    public BookService(BookPersistencePort bookPersistencePort) {
        this.bookPersistencePort = bookPersistencePort;
    }

    @Override
    public BookDTO addBook(BookDTO bookDTO) {
        return bookPersistencePort.addBook(bookDTO);
    }

    @Override
    public void deleteBookById(Long id) {
        bookPersistencePort.deleteBookById(id);
    }

    @Override
    public BookDTO updateBook(BookDTO bookDTO) {
        return bookPersistencePort.updateBook(bookDTO);
    }

    @Override
    public List<BookDTO> getBooks() {
        return bookPersistencePort.getBooks();
    }

    @Override
    public BookDTO getBookById(Long id) {
        return bookPersistencePort.getBookById(id);
    }
}
