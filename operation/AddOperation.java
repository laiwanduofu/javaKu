package package_bookmanager.operation;

import package_bookmanager.book.Book;
import package_bookmanager.book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("请新增一本书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名：");
         String name=scanner.next();
        System.out.println("请输入ID：");
        String id=scanner.next();
        System.out.println("请输入作者：");
        String author=scanner.next();
        System.out.println("请输入价格：");
        int price=scanner.nextInt();
        System.out.println("请输入类型：");
        String type=scanner.next();
        Book book=new Book(name,id,author,price,type,false);
        bookList.setBook(bookList.getSize(),book);
        bookList.setSize(bookList.getSize()+1);
    }
}
