
public class CreateThread2 {
    public static void main(String[] args) {
        int num=10;
        MyRunner2 myRunner2=new MyRunner2(num);
        for(int i=0;i<10;i++){
            Thread myThread2=new Thread(myRunner2);
            myThread2.start();
        }
    }
}
class MyThread2 extends Thread{
    private int i;

    public MyThread2(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
class MyRunner2 implements Runnable{
    private int i;

    public MyRunner2(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
