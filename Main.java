package package_bookmanager;

import package_bookmanager.User.Admin;
import package_bookmanager.User.NormalUser;
import package_bookmanager.User.user;
import package_bookmanager.book.BookList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList=new BookList(); //准备好书籍信息数据
        user users=login(); //创建用户
        while (true){
            int choice=users.menu();
            users.doOperation(choice,bookList);

        }
    }
    public static user login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name=scanner.next();
        System.out.println("请输入您的角色：(1,普通用户  2，管理员  ");
        int role=scanner.nextInt();
        if(role==1){
            return new NormalUser(name);
        }
        return new Admin(name);
    }
}
