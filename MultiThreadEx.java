class MyTask extends Thread{

    public void run(){
        for (int i = 1; i <=3; i++);

        System.out.println(Thread.currentThread().getName()+ "Running");
    }
}

public class MultiThreadEx {
    public static void main(String[] args) {
        // MyTask task = new MyTask();

        // Thread t1 = new Thread(task,"Emp-1");
        // Thread t2 = new Thread(task,"Emp-2");
        // t2.setPriority(Thread.MAX_PRIORITY);
        // t1.start();
        // t2.start();

        try{
            System.out.println("Program is Start");
            Thread.sleep(3000);
            System.out.println("Program resume After 3 seconds.");
        }catch(Exception e) {
            System.out.println(e);

        }

        
    }
}


// # Types of sheduling
//1)primitive sheduling:-here the sheduler can pouse a running thread and give CPU to another thread
//Ex:
//2) time slicing:-Each thread gets small CPU time

//usually higher priority thread run firt 



// # Thread.set method # //
//Thread.sleep it is a method use to pouse the execution of current thread for specific time
//Use cases :- 1)delay execution 2) controll thread timing 3) simulate processing time 4)Avoid CPU overuse
//thread.sleep method always throw and enterrepted exception you must handle it by using try and catch method 
//thread.sleep is  apply on only current thread