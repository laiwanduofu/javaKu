package package_bookmanager.User;

import package_bookmanager.book.BookList;
import package_bookmanager.operation.IOperation;

abstract public class user {
    protected   String name;

    protected IOperation []operations;
    abstract  public int menu();
    public void doOperation(int choice, BookList bookList){
        operations[choice].work(bookList);
    }
    public user(String name) {
        this.name = name;
    }
}
