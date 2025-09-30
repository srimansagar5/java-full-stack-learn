🔹 1. Introduction to Collections
Arrays are fixed in size → Collections are dynamic.
Collections framework = interfaces + classes + algorithms.
Root interface: Collection (except Map).
Utility class: Collections (helper methods).

🔹 2. List
Definition: Ordered, allows duplicates, index-based access.
Common Implementations:
    ArrayList → Fast random access.
    LinkedList → Fast insert/delete.
Key Methods: add, get, set, remove, size, contains.

How the ArrayList works
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. 
If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

How the LinkedList works
The LinkedList stores its elements in "containers." 
The list has a link to the first container and each container has a link to the next container in the list. 
To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

When To Use
Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

🔹 3. Set
Definition: No duplicates(unique), unordered (depends on type).
Types:
    HashSet → No order, fastest lookup.
    LinkedHashSet → Keeps insertion order(remembers the order they were added.).
    TreeSet → Sorted order.
Key Methods: add, remove, contains, size.

🔹 4. Map
Definition: Stores key-value pairs, unique keys.
Types:
    HashMap → Fast, unordered.
    LinkedHashMap → Maintains insertion order.
    TreeMap → Sorted keys.
Key Methods: put, get, remove, containsKey, keySet, values.


List	                Set                                         Map
Allows duplicates	    Does not allow duplicates                   Key: unique, value: allow duplicate
Maintains order	        Does not guarantee order                    Does not guarantee order
                        (unless using TreeSet or LinkedHashSet)     (unless using TreeMap or LinkedHashMap)
Access by index	        No index-based access


Feature	            HashSet	                    TreeSet                         LinkedHashSet
Order	            No guaranteed order	        Sorted (natural order)          Insertion order preserved
Duplicates	        Not allowed	                Not allowed                     Not allowed
Performance	        Faster (no sorting)	        Slower (due to sorting)         Slightly slower (due to order tracking)