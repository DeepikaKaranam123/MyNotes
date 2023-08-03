
package com.lvg.JdbcDemo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import com.lvg.Jdbc.model.service.BookService;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	BookService bookService=new BookService();
    	Scanner sc=new Scanner(System.in);
    	int opt=0;
    	do
    	{
    		System.out.println("1. Add Book");
    		System.out.println("2. Show All Books");
    		System.out.println("3. Show Books By Category");
    		System.out.println("4. Show Book by Title");
    		System.out.println("5. Delete Book by Title");
    		System.out.println("6. Exit");
    		System.out.println("Enter your option :-");
    		opt =sc.nextInt();
    		
    		switch(opt)
    		{
    		case 1:
    			bookService.addBook();
    			break;
    		case 2:
    			bookService.showAllBooks();
    			break;
    		case 3:
    			bookService.showBookByTitle();
    			break;
    		case 4:
    			bookService.showBookByCategory();
    			break;
    		case 5:
    			bookService.deleteBookByTitle();
    			break;
    		case 6:
    			System.out.println("you are quitting now");
    			break;
    		default:
    			System.out.println("Not a Correct Option.../. Please choose the correct one");
    		}
    	}while(opt!=6);

       }
}




















