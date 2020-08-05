package list;
import java.util.Collections;
import java.util.Vector;
import java.util.List;
public class VectorDemo {
    public static void main(String[] args) {
        //implements list interface, duplicate allow, null allow, insertion order is preserved
        //Vector class is extended by Stack class
        Vector<Integer> v = new Vector<>();
        v.add(11);
        v.add(21);
        v.add(13);
        v.add(6);
        v.add(78);
        v.add(19);
        v.add(13);
        v.add(11);
        System.out.println(v);
        System.out.println("Initial capacity : "+v.capacity());
        System.out.println("size : "+ v.size());
        System.out.println(v.contains(78));
        
        //accessing element by a index
        System.out.println(v.elementAt(2));
        System.out.println(v.get(3));
        
        
        //first element
        System.out.println(v.firstElement());
        //last element
        System.out.println(v.lastElement());
        
        
        //return the index value of specified element
        System.out.println(v.indexOf(19));
        
        //remove element by index
        System.out.println(v.remove(0));
        System.out.println(v);
        
        //change the value of element by a index
        v.set(0, 22); //returns the element at index 0
        System.out.println(v);
        
        //sublist
        List<Integer> vsub = v.subList(1, 4); //1 include //4 is excluded
        System.out.println(vsub);
        
        //at elment at index 2
        v.add(2, 25);
        System.out.println(v);
        
        
        //sorting the vector elements
        Collections.sort(v);
        System.out.println(v);
        
    }
}
