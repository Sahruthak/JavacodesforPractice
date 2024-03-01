import java.io.*;
public class Main extends Thread
{
	public static void main(String[] args) {
        Main m1=new Main();
        Main m2=new Main();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
	}
	public void run(){
	    System.out.println("Thread " +Thread.currentThread().getName()+"   "+"Running thread " +Thread.currentThread().getPriority());
	}
}



