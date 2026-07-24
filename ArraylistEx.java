import java.util.*;
public class ArraylistEx {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("ramesh");
        names.add("ram");
        names.add("rohit");
        names.add("raj");

        System.out.println(names.get(2));
        System.out.println(names);

        names.remove("raj");

        System.out.println(names);
    }
}

//int is a premetive data type


//all methods of ArrayList?
// | Method                                | Meaning                                                              |
// | ------------------------------------- | -------------------------------------------------------------------- |
// | `add(E e)`                            | Adds an element to the end of the list.                              |
// | `add(int index, E element)`           | Inserts an element at the specified position.                        |
// | `addAll(Collection c)`                | Adds all elements from another collection.                           |
// | `addAll(int index, Collection c)`     | Inserts all elements at the specified position.                      |
// | `get(int index)`                      | Returns the element at the specified index.                          |
// | `set(int index, E element)`           | Replaces the element at the specified index.                         |
// | `remove(int index)`                   | Removes the element at the specified index.                          |
// | `remove(Object o)`                    | Removes the first occurrence of the specified element.               |
// | `removeAll(Collection c)`             | Removes all elements present in the given collection.                |
// | `removeIf(Predicate p)`               | Removes elements that satisfy a condition.                           |
// | `retainAll(Collection c)`             | Keeps only elements present in the specified collection.             |
// | `clear()`                             | Removes all elements from the list.                                  |
// | `size()`                              | Returns the number of elements.                                      |
// | `isEmpty()`                           | Returns `true` if the list has no elements.                          |
// | `contains(Object o)`                  | Checks whether the list contains the specified element.              |
// | `containsAll(Collection c)`           | Checks whether all elements of another collection exist in the list. |
// | `indexOf(Object o)`                   | Returns the first index of the element.                              |
// | `lastIndexOf(Object o)`               | Returns the last index of the element.                               |
// | `toArray()`                           | Converts the list into an `Object[]` array.                          |
// | `toArray(T[] a)`                      | Converts the list into a typed array.                                |
// | `iterator()`                          | Returns an iterator for forward traversal.                           |
// | `listIterator()`                      | Returns a bidirectional iterator.                                    |
// | `listIterator(int index)`             | Returns a bidirectional iterator starting from the given index.      |
// | `subList(int fromIndex, int toIndex)` | Returns a view of a portion of the list.                             |
// | `clone()`                             | Returns a shallow copy of the `ArrayList`.                           |
// | `equals(Object o)`                    | Compares two lists for equality.                                     |
// | `hashCode()`                          | Returns the hash code of the list.                                   |
// | `forEach(Consumer action)`            | Performs the given action for each element.                          |
// | `replaceAll(UnaryOperator op)`        | Replaces each element using the given operation.                     |
// | `sort(Comparator c)`                  | Sorts the list using the specified comparator.                       |
// | `spliterator()`                       | Creates a `Spliterator` for parallel processing.                     |
// | `stream()`                            | Returns a sequential stream of the elements.                         |
// | `parallelStream()`                    | Returns a parallel stream of the elements.                           |
// | `ensureCapacity(int minCapacity)`     | Increases the internal capacity if needed.                           |
// | `trimToSize()`                        | Reduces the capacity to match the current size.                      |

//Methods from Collections class (used with ArrayList)
// | Method                                         | Meaning                                          |
// | ---------------------------------------------- | ------------------------------------------------ |
// | `Collections.sort(list)`                       | Sorts the list in ascending order.               |
// | `Collections.reverse(list)`                    | Reverses the list.                               |
// | `Collections.shuffle(list)`                    | Randomly shuffles the list.                      |
// | `Collections.swap(list, i, j)`                 | Swaps two elements.                              |
// | `Collections.max(list)`                        | Returns the maximum element.                     |
// | `Collections.min(list)`                        | Returns the minimum element.                     |
// | `Collections.frequency(list, obj)`             | Counts occurrences of an element.                |
// | `Collections.fill(list, obj)`                  | Replaces every element with the specified value. |
// | `Collections.copy(dest, src)`                  | Copies elements from one list to another.        |
// | `Collections.binarySearch(list, key)`          | Searches a sorted list using binary search.      |
// | `Collections.rotate(list, distance)`           | Rotates the elements in the list.                |
// | `Collections.replaceAll(list, oldVal, newVal)` | Replaces all occurrences of a value.             |
