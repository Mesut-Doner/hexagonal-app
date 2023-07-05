package com.mdoner.projects.book.mapper;


import com.mdoner.projects.data.BookDTO;
import com.mdoner.projects.book.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO bookToBookDTO(Book book);

    Book bookDTOToBook(BookDTO bookDto);

    List<BookDTO> bookListToBookDTOList(List<Book> bookList);

    List<Book> BookDTOListTobookList(List<BookDTO> BookDtoList);

}
