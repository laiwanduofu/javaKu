public class createThread {
    public static void main(String[] args) {
       MyThread T=new MyThread();
        T.start();
        MyRunner a=new MyRunner();
        Thread t2=new Thread(a); // Runnable tmp=a;
        t2.start();
        while(true){

        }
    }
}
//继承Thread
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("in thread");
        while (true){

        }
    }
}
// 实现Runnable接口
class MyRunner implements Runnable{

    @Override
    public void run() {
        System.out.println("in runnable");
        while (true){

        }
    }
}
