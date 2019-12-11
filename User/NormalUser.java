package package_bookmanager.User;
import package_bookmanager.operation.*;

import java.util.Scanner;
public class NormalUser extends user {

    public NormalUser(String name) {
        super(name);
        operations= new IOperation[] {
                new ExitOperation(),
                new FIndOperation(),
                new BorrownOperation(),
                new ReturnOperation(),
        };
    }

    @Override
          public int  menu() {
        System.out.println("=======================");
        System.out.println("hello"+name);
        System.out.println("1,查找图书");
        System.out.println("2,借阅图书");
        System.out.println("3,归还图书");
        System.out.println("0，退出");
        System.out.println("请输入您的选择：");
        Scanner scanner=new Scanner(System.in);
        int choice =scanner.nextInt();
        return choice;
    }
}

