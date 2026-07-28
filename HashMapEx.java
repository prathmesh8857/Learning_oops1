import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
         map.put(101,"Raj");
         map.put(102,"Rudra");
         map.put(103,"Raju");
         map.put(104,"Rakesh");
         map.put(105,"Ramesh");

         System.out.println(map.get(103));

         System.out.println(map.containsKey(102));

         //map.remove
         for(Integer elem : map.keySet()) {
            System.out.println(elem + "." + map.get(elem));
         }

    }
}
//hash map is class that stores data in key value pairs
//why we use hashmap?
//->1)fAST DATA access 2) easy lookup 3)no need to look like array list 4)when you need unique kees 5) order dosnt matter
//6) when you want O(1) average lookup time
//EX:Use cases:- 1)storing configuration 2)caching data 3) mapping ID's With object

//HashMap stores data in key value pair it uses hash code to calculate bucket index if multiple kays map to a same bucket colligen handling is done using link list or tree(after java ate) retrival is fast becouse it directly goes to the bucket using hash.

//CONTAINSKEY always return boolean answer

//# METHODS
//1)put 
//2)putitupsent
//3)get
//4)getordefault
//5)Containskey
//6)Containsvalue
//7)size
//8)isempty
//9)replace
//10)Compute
//11)Computeitupsent
//12)murge
//13)remove
//keyset
//foreach
//entryset
//clone
//clear

