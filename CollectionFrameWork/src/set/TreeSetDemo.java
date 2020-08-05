//TreeSet : same as HashSet,LinkedHashSet but object are stored in a sorted and ascending order.
//1)  TreeSet and TreeMap which are the implementation of a self-balancing tree(Red Black Tree).
package set;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        //Time complexity : O(h) -> h = height of red black tree
        ts.add(4);
        ts.add(67);
        ts.add(65);
        ts.add(90);
        ts.add(59);
        ts.add(56);
        ts.add(78);
        ts.add(78);//duplicate not allowed
        System.out.println(ts);
        
        //first
        System.out.println(ts.first());
        
        //last
        System.out.println(ts.last());
        
        //cheacking or searching : O(h)  h = heisht
        System.out.println(ts.contains(56));
        System.out.println(ts.contains(100));
        
        //removing : O(h)
        System.out.println(ts.remove(67));
        System.out.println(ts);
        
        //iterating through treeset
        for(Integer val : ts)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        
        //floor : O(h)
        System.out.println("floor of 70 : "+ts.floor(70));
        System.out.println("floor of -70 : "+ts.floor(-70));//if floor not present it returns null
        
        //ceiling : o(h) 
        System.out.println("Ceiling of 57 : "+ts.ceiling(57));
        
        System.out.println(ts);
        //lower() : O( h)
        //This method returns the greatest element in this set strictly less than the given element, 
        //or null if there is no such element.
        System.out.println("lower of  62 : "+ts.lower(62));
        System.out.println("lower of  65 : "+ts.lower(65));
        System.out.println("lower of  4 : "+ts.lower(4));
        
        
        
        
        
        
    }
}
