import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
    Hashtable<Integer, String> tab = new Hashtable<>();
      tab.put(101, "Raj");
      tab.put(102, "Rudra");
      tab.put(103, "Raju");
      tab.put(104, "Rakesh");
      tab.put(105, "Ramesh");
      System.out.println((String)tab.get(103));
      System.out.println(tab.containsKey(102));

      for(Integer elem : tab.keySet()) {
         System.out.println(elem + "." + (String)tab.get(elem));
      }
    }
}
//hash table is class that stores keyvaluepair
//when to use : when you need threadset key value pair storage 2) when null values are not allowed 3)lagacy systems
//hash table is threadsefe but slower
//hash map is faster but not threadsafe
