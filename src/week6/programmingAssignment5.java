package week6;

public class programmingAssignment5 extends Thread{
    public void run(){

    }
    public static void main(String args[]){
        programmingAssignment5 t1=new programmingAssignment5();
        System.out.println("Name of thread 't1':"+ t1.getName());

        programmingAssignment5 t2=new programmingAssignment5();
        System.out.println("Name of thread 't2':"+ t2.getName());

        // start the thread-1

        t1.start();

        // set the name of thread-1

        t1.setName("Week 6 Assignment Q5");


        // start the thread-2

        t2.start();

        // set the name of thread-2

        t2.setName("Week 6 Assignment Q5 New");


        System.out.println("New name of thread 't1':"+ t1.getName());
        System.out.println("New name of thread 't2':"+ t2.getName());

    }
}
