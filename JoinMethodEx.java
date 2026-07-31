class MyTask extends Thread{

    public void run(){
        for(int i = 1; i <=3; i++){
            System.out.println("main thread " + i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}


public class JoinMethodEx {
    public static void main(String[] args) throws InterruptedException {
        MyTask t1 = new MyTask();
        t1.start();
        t1.join(1500);

        for(int i = 1; i <=3; i++){
            System.out.println("main thread " + i);
    }
}
}



//join method is use to make one thread until another thread complete its execution it insures proper execution order when their is dependency between thread
