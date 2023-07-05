package com.mdoner.projects.book.adapters;


import com.mdoner.projects.book.base.repository.BookRepository;
import com.mdoner.projects.book.entity.Book;
import com.mdoner.projects.book.mapper.BookMapper;
import com.mdoner.projects.data.BookDTO;
import com.mdoner.projects.ports.BookServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ComponentScan("com.mdoner.projects")
public class BookJpaAdapter implements BookServicePort {

    private final BookRepository bookRepository;


    @Autowired
    private BookMapper bookMapper;

    public BookJpaAdapter(@Autowired BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDTO addBook(BookDTO bookDTO) {
        Book bookEntity = bookMapper.bookDTOToBook(bookDTO);
        bookEntity.setBookDescription(bookDTO.getDescription());
        bookEntity.setBookPrice(bookDTO.getPrice());
        bookEntity.setBookId(bookDTO.getId());
        bookEntity.setBookTitle(bookDTO.getTitle());

        return bookMapper.bookToBookDTO(bookRepository.save(bookEntity));
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDTO updateBook(BookDTO bookDTO) {
        Book bookEntity = bookMapper.bookDTOToBook(bookDTO);
        deleteBookById(bookDTO.getId());
        return bookMapper.bookToBookDTO(bookRepository.save(bookEntity));
    }

    @Override
    public List<BookDTO> getBooks() {
        List<Book> bookList = bookRepository.findAll();


        return bookMapper.bookListToBookDTOList(bookList);
    }

    @Override
    public BookDTO getBookById(Long id) {
        Book bookEntity = bookRepository.getReferenceById(id);
        return bookMapper.bookToBookDTO(bookEntity);
    }
}
