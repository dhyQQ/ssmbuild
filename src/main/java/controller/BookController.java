package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String allBook(Model model){

        List<Book> bookList = bookService.queryAllBook();

        model.addAttribute("bookList",bookList);

        for (Book book : bookList) {
            System.out.println(book.toString());
        }

        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book){

        bookService.insertBook(book);

        return "redirect:/allBook";
    }

    @RequestMapping("/toUpdateBook/{bookId}")
    public String toUpdateBook(@PathVariable("bookId") int id, Model model){
        Book book = bookService.queryBookById(id);

        model.addAttribute("QBook",book);

        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Book book){
        bookService.updateBook(book);
        return "redirect:/allBook";
    }

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBook(id);
        return "redirect:/allBook";
    }

    @RequestMapping("/queryBookByName")
    public String queryBookByName(String bookName,Model model){
        Book book = bookService.queryBookByName(bookName);
        System.out.println("============="+book);
        List<Book> bookList = new ArrayList<>();
        if (book != null) {
            bookList.add(book);
            model.addAttribute("bookList",bookList);
        }else{
            model.addAttribute("err","未找到！");
        }
        return "allBook";
    }

}
