import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("pranav");
        set.add("prakash");
        set.add("prashant");
        set.add("pravin");

        System.out.println(set);
    }
}
//Hash set is the collection that stores only unique values no duplicate allowed internally it uses hashing concept
//Hash Set use hash map internally and store element as a key with constant dumy value
// # Use hash Set when 1) firt you want unique element 2) you dont care about the oerder 3)you want fast performance
// # dont use when 1) you need ordering 2) you need sorting
//add,remove,size,empty



//vector,hashmap,hashtable