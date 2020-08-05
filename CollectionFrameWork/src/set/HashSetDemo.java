//  HashSet implements set interface and work like a HashTable
// 1) NULL elements are allowed in HashSet.
// 2) take o(1) time : operations such as add(), remove(), contains(), size()
// 3) As it implements the Set Interface, duplicate values are not allowed
// 4) doesn't preserve insertion order

/*   Internal working of a HashSet
All the classes of Set interface internally backed up by Map. HashSet uses HashMap for storing its object internally. 
You must be wondering that to enter a value in HashMap we need a key-value pair, 
but in HashSet we are passing only one value.

Storage in HashMap
Actually the value we insert in HashSet acts as key to the map Object and for its value java uses a constant variable. 
So in key-value pair all the values will be same.
*/
package set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        //Default initial capacity is 16 and default load factor is 0.75.
        //load factor = total no stored in hash table / size of hash table
        
        //insertion takes O(1) time
        hs.add(10);
        hs.add(56);
        hs.add(2);
        hs.add(67);
        hs.add(90);
        hs.add(-87);
        //ignore duplicate value
        hs.add(90);
        hs.add(null);
        System.out.println(hs);
        
        
        //remove takes O(1) time
        hs.remove(-87);
        System.out.println(hs);
        
        //check whether the given element is present in HashSet or not : O(1)
        System.out.println(hs.contains(56));
        
        //aceess using iterator
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext())
        {System.out.print(it.next()+"  ");}
    }
}
