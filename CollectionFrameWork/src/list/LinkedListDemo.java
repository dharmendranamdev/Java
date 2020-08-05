
package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        LinkedList<String> link = new LinkedList<>();
        //implements list interface and internally implement LinkedList
        //duplicate allows, null allows, insertion order preserved
        link.add("Dharm");
        link.add("Harsh");
        link.add("Quazi");
        link.add("Himanshu");
        link.add("Ramdev");
        link.add("Quazi");
        link.add(null);
        System.out.println(link);
        
        //Add "Ashu" at first
        link.addFirst("Ashu");
        System.out.println(link);
        
        //add "Bablesh" at last
        link.addLast("Bablesh");
        System.out.println(link);
        
        //remove first element 
        link.removeFirst();
        System.out.println(link);
        
        //get first and last element of linked list      
        System.out.println("Get first :"+link.getFirst());
        System.out.println("Get Last :"+link.getLast());
        
        //check whether the linked list is empty.
        System.out.println(link.isEmpty());
        
        
        //retrieving : first element of linked list
        System.out.println(" first elment of linked list : "+link.peek());
        System.out.println(" first elment of linked list : "+link.peekFirst());
        
        //last element of linked list
        System.out.println(" Last elment of linked list : "+link.peekLast());
        
        //removing first
        System.out.println("remove first:"+link.poll()); // or link.pollFirst();
        System.out.println(link);
        
        //removing last element 
        System.out.println("Remove last : "+link.pollLast());//or  link.removeLast();
 
        //remove first and last occurances of elments
        System.out.println(link);
        link.removeFirstOccurrence("Quazi");
        System.out.println(link);
        
        //set the value of element at specified index
        link.set(2, "Pandey");
        System.out.println(link);
        
        //toArray : return array of object
        Object a[] = link.toArray();
        System.out.println(a[1]);
        
        String str = Arrays.toString(a);//convert object array into string
        System.out.println(str);
        
        //remove null element from linked list
        link.remove(null);
        //sorting
        Collections.sort(link);
        System.out.println("sorted list : "+ link);
    }
}
