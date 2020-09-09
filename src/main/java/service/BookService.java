package service;

import pojo.Book;

import java.util.List;

public interface BookService {

    //allBook
    public List<Book> queryAllBook();

    //addBook
    public int insertBook(Book book);

    //queryBookById
    public Book queryBookById(int id);

    //updateBook
    public int updateBook(Book book);

    //deleteBook
    public int deleteBook(int id);

    //queryBookByName
    public Book queryBookByName(String name);
}
