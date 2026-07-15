class demo {
    int id;

    demo(int id){
        this.id = id;
    }
}




public class garbagecollector {
    public static void main(String[] args) {
        demo obj = new demo(1);
        demo obj2 = new demo(2);

        obj = null;//Making object elogibal for garbage collection
        System.gc();//Requesting JVM to rum garbage collector
        System.out.println("Program is still running....");
    }
}


//# Garbage collector #//
//garbage collector is a JVM machanism that automatically detect unused object from memory when an object is not used any more GC(garbagr collactor)remove it and free's memory


//Why GC exist?
//To avoid memory leaks 2) To reduse manual memory management


//When garbage collector runs?
//-When JVM feels memory is low 2) When object are no more reference

//SYSTUM.GC this method is use to call gc

//this. refers same class members in constructor
//
//
//
//
//