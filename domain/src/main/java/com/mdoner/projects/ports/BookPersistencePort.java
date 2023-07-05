package com.mdoner.projects.ports;

import com.mdoner.projects.base.port.BasePort;
import com.mdoner.projects.data.BookDTO;

import java.util.List;

public interface BookPersistencePort extends BasePort {

    BookDTO addBook(BookDTO bookDTO);

    void deleteBookById(Long id);

    BookDTO updateBook(BookDTO bookDTO);

    List<BookDTO> getBooks();

    BookDTO getBookById(Long id);


}
