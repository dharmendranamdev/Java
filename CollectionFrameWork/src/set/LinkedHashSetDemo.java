//First read : HashSet
//implements HashSet, it is same as HashSet but it preserves insertion order by doubly linked list
package set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkhs = new LinkedHashSet<>();
        linkhs.add(78);
        linkhs.add(4);
        linkhs.add(5);
        linkhs.add(90);
        //ignore duplicate element
        linkhs.add(4);
        System.out.println("preserve insertion order: "+linkhs);
        
        //remove
        System.out.println(linkhs.remove(4));
        System.out.println(linkhs);
        
        //search
        System.out.println(linkhs.contains(4));
    }
}
