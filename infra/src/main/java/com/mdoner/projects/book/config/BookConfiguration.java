package com.mdoner.projects.book.config;


import com.mdoner.projects.book.adapters.BookJpaAdapter;
import com.mdoner.projects.book.base.repository.BookRepository;
import com.mdoner.projects.book.mapper.BookMapper;
import com.mdoner.projects.book.mapper.BookMapperImpl;
import com.mdoner.projects.ports.BookServicePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mdoner.projects")
public class BookConfiguration {

    @Bean
    public BookServicePort getBookServicePortBean(BookRepository bookRepository) {
        return new BookJpaAdapter(bookRepository);
    }

    @Bean
    public BookMapper getBookMapperBean() {
        return new BookMapperImpl();
    }
}
