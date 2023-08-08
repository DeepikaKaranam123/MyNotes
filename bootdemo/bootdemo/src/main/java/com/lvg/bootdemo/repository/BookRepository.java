package com.lvg.bootdemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lvg.bootdemo.entity.Book;

public interface BookRepository extends JpaRepository<Book,Double>{
//imports crud operations automatically
	Optional<Book> findByBookTitle(String bookTitle);
	//List<Book> findByBookAuthor(String bookAuthor);
	Optional<Book> findByBookPrice( Double bookPrice);
}
