package week6;

public class programmingAssignment1 extends Thread{
    public void run(){
        System.out.print("Thread is Running.");
    }

    public static void main(String[] args){

        // Creating object of thread class
        programmingAssignment1 thread=new programmingAssignment1();

        // Start the thread
        thread.start();
    }
}
