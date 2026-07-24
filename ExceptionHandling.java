// public class ExceptionHandling {
//     public static void main(String[] args) {
//         try {
//             //Risk code
//         }catch(Exception e) {
//             //Handling code
//         }
//         finally{
//             //Always Execute
//         }
//     }
// }


// # Types of Exception Handling # //
//when program runs some time unexpected error happens this error are called exception if we do not handle it the program will terminate so java provides exception handling to handle such errors and keep program running.
//EX:-
//difference between final,finallyand finalize?
// 1)Try block:-Try block contain Risky code,risky code means a code that may couse exception.
// 2)Catch block:-Catch block handles the exception,If Exception occurs in try block then catch block will execute.
// EX:-
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         try {
//             //Risk code
//             int a = 10;
//             int b = 0;

//             int result = a/b;
//             System.out.println(result);
//         }catch(ArithmeticException e) {
//             //Handling code
//             System.out.println("Cannot divide by 0..");
//         }
//         System.out.println("Preogram is running..");
        
//     }
// }


// 3)Finally block:-EX:-
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         try {
//             //Risk code
//             int a = 10;
//             int b = 0;

//             int result = a/b;
//             System.out.println(result);
//             int arr[] = {1,2,3};
//             System.out.println(arr[4]);
//         }catch (Exception ex) {
//             //Handling code
//             System.out.println(ex.getMessage());
//         }finally{
//             System.out.println("Program is finally Block..");
//         }
//         System.out.println("Preogram is running..");
        
//     }
// }

//through keyword:-through is use to manually create an exception.
//EX:-
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         try {
//             //Risk code
//             int age = 16;
//             if (age <= 18) {
//                 throw new ArithmeticException("Age is less than 18..");
//             }
//             System.out.println("Eligible");
            
//         }catch (Exception ex) {
//             //Handling code
//             System.out.println(ex.getMessage());
//         }finally{
//             System.out.println("Program is finally Block..");
//         }
//         System.out.println("Preogram is running..");
        
//     }
// }
//throws keyword:-throws keyword is use with method dicleration.
//EX:-

// import java.io.FileReader;
// import java.io.IOException;

// public class ExceptionHandling {

//     public static void readFile() throws IOException {
//         FileReader fr = new FileReader("abc.txt");
//     }
    
//     public static void main(String[] args) throws IOException {
//         readFile();
// }
// }


 public class ExceptionHandling {
     public static void main(String[] args) {
         try {
             //Risk code
             int a = 10;
             int b = 0;

             int result = a/b;
             System.out.println(result);
            }finally{
             System.out.println("Program is finally Block..");
         }

        }

    }
    //super keyword is use for call the objects from parent class