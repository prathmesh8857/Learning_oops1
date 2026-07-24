import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String str = "Java C C++ Python JavaScript";

        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken().trim());
        }
    }
}

// A block tells to compiler 
//why do we need blocks:-1)group multiple ststements 2)to organize code 3)define mothods,loops,classes,constructor,etc 4)Create veriable scope.
//What is vwriable scope:-veriable scope means the area or reagion of program where veriable can be access.
        //public class main {
        //public static void main(String[] args) {
        //{
        //String str = "java,c,c++,javascript";
        //System.out.println(str);
        //}
        //}
        //}
        // #types of block# //
        //1)local block
        //2)method block
        //3)constructor block
        //4)loop block
        //5)conditional block
        //6)static and instance initialization block:- this block runs once when the class is loaded.