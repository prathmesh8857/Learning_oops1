// public class StringEx {
//     public static void main(String[] args) {
//         String a = "java";//assignment operator
//         String b = "java";
//         System.out.println(a == b);
//     }
// }

// public class StringEx {
//     public static void main(String[] args) {
//         String c = new String("java");//assignment operator
//         String d = new String("java");
//         System.out.println(c == d);
//     }
// }

// public class StringEx {
//     public static void main(String[] args) {
//          String c = new String("java");//assignment operator
//          String d = new String("java");
//          System.out.println(c.equals (d));
//     }
//  }


// //string immutable//
// public class StringEx {
//     public static void main(String[] args) {
//          String str = "ram";

//          str = str.concat("fct");

//          System.out.println(str);
//     }
//  }

 public class StringEx {
    public static void main(String[] args) {

         String str = "Rajaram";

         System.out.println("The length of string is: " + str.length());
         System.out.println("The uppercase of string is: " + str.toUpperCase());
         System.out.println("The lowercase of string is: " + str.toLowerCase());
         String str1 = " Rajaram ";
         System.out.println("Tremmingthe string: "+ "'" + str1.trim() + "'");
         System.out.println( str.substring(3));
         System.out.println( str.substring(0,3));
         String str2 = "Hallow ";
         String str3 = "World";
         System.out.println("concating two string: " +str2.concat(str3));
         System.out.println("Replacing charactor in a string: "+ str.replace('a', 'o'));
         System.out.println("Chaking if the string contains a substring: "+str.contains("an"));
         System.out.println("Charactor at index: " +str.charAt(2));
    }
 }



//string is use to store text(in a sequence of caractor) mo no,name.address,description etc
//String is a detatype(String is a class)
//In java String is not a primitive detatype String is a class that belongs to java.lang.Strings that means string is an object that stores charactors,
//we use or declare string 1)by using (NEW) keyword 2)by using string literal(String name = 'ram';)
//java stores (String name = 'ram';) in string pull
//string pull:- string constant pull is seprate block of memory where the string object held by JVM
//to store string we use string pull.
//if a string object is created derectecly using assignment operator then it is store in String constant pull.
//new keyword Ex:-String name = new stringex('ram');
//(c.equals (d)); this show always boolean values
//when we use  NEW keyword, string is stored in hipp memory
//string is immutable(it cannot be changed after creation):-
//every string is a charactor array
// rules of string //