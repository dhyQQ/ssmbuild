package service;

import dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pojo.Book;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookMapper")
    private BookMapper bookMapper;

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public int insertBook(Book book) {
        return bookMapper.insertBook(book);
    }

    @Override
    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public Book queryBookByName(String name) {
        return bookMapper.queryBookByName(name);
    }
}
