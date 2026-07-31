class MyTask extends Thread{

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Demon thread is running");
        }else{
            System.out.println("User thread is running");
        }
    }
}

public class DeamonThreadEx {
    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        

    }
}



//deamon thread is background thread that runs behind the main program to support other threads.
//2)signal dispacher 3)finalizae thread
//how to use set dimon?



//join method is use to make one thread until another thread complete its execution it insures proper execution order when their is dependency between thread

