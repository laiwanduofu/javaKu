package package_bookmanager.operation;

import package_bookmanager.book.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("再见");
        System.exit(0);
    }
}
