package com.lvg.Jdbc.model.service;
import java.util.Scanner;

import com.lvg.Jdbc.model.bean.Book;
import com.lvg.Jdbc.model.dao.BookDAO;
public class BookService {
	private static Scanner sc=new Scanner(System.in);
	private BookDAO bdao = new BookDAO();
	public String addBook()
	{
		System.out.println("Enter Book Id");
		String bookId=sc.nextLine();
		System.out.println("Enter Book Title");
		String bookTitle=sc.nextLine();
		System.out.println("Enter Book Author");
		String bookAuthor=sc.nextLine();
		System.out.println("Enter Book Category");
		String bookCategory=sc.nextLine();
		System.out.println("Enter Book Price");
		double bookPrice=sc.nextDouble();
		System.out.println("Enter Book Copies");
		int copies=sc.nextInt();
		sc.next();
		if(bdao.insertBook(new Book(bookId,bookTitle,bookAuthor,bookCategory,bookPrice,copies)))
			return "Book Details Added";
		return "Book Addition Failed";
		
	}
	public void showAllBooks()
	{
		for(Book b : bdao.getAllBooks())
			System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());
	}
	public void showBookByTitle()
	{
		System.out.println("Enter book title");
		String bookTitle=sc.nextLine();
		Book b=bdao.getBookByTitle(bookTitle);
		if(b!=null)
			System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());
		else 
			System.out.println("Book Does not exists by title"+bookTitle);
		
	}
	public void showBookByCategory()
	{
		
		System.out.println("Enter book category");
		String bookCategory=sc.nextLine();
		Book b=bdao.getBookByTitle(bookCategory);
		if(b!=null)
			System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());
		else 
			System.out.println("Book Does not exists by title"+bookCategory);
	}
	
	public void deleteBookByTitle()
	{
		System.out.println("Enter book title");
		String bookTitle=sc.nextLine();
		
		if(bdao.deleteBookByTitle(bookTitle))
			System.out.println(bookTitle+" Deleted Successfuly");
		else 
			System.out.println("Book Does not exists by title"+bookTitle);
		
	}
	
}
