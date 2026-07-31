// class MyTask extends Thread{
//     public void run(){
//         for (int i = 1; i <=3; i++);

//         System.out.println(Thread.currentThread().getName()+ "Running");
//     }
// }


// public class MultithreadEx2 {
//     public static void main(String[] args) {
//         MyTask t1 = new MyTask();

//         t1.start();

//         MyTask t2 = new MyTask();

//         t2.start();

//     }
// }

//thread pull is a collection of precreated thread that are reuse to execute multiple task.
//differ btwn thread and runnable import method

//java.util.concurent.executerservice

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable{
    public void run(){

        System.out.println(Thread.currentThread().getName()+ "Running");
    }
}


public class MultithreadEx2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(new MyTask());
        service.execute(new MyTask());
        service.execute(new MyTask());
        service.execute(new MyTask());
        service.shutdown();
    }
}



//