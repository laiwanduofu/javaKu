package package_bookmanager.operation;

import package_bookmanager.book.Book;
import package_bookmanager.book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要归还的书籍的编号：");
        String id= scanner.next();
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBook(i);
            if(!book.getId().equals(id)){
                continue;
            }
            //具体的归还操作
            if(!book.isBorrowed()){
                System.out.println("这本书 已经被还了！");
                break;
            }
            book.setBorrowed(false);
        }
    }
}
