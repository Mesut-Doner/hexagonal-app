package com.mdoner.projects.book.entity;

import com.mdoner.projects.book.base.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books_table")
public class Book extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    @Column
    private String bookTitle;
    @Column
    private String bookDescription;
    @Column
    private BigDecimal bookPrice;

}
