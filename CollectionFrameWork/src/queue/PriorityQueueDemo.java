// The PriorityQueue is based on the priority heap(min heap and max heap)
//1) PriorityQueue doesn’t permit null.
//2) The PriorityQueue class implements the Queue interface in Java. 
//3) A PriorityQueue is beneficial when the objects are supposed to be processed based on the priority 
//   rather than the First-In-First-Out (FIFO) algorithm, 

package queue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //---------------------------Increasing order----------------------------------------
        PriorityQueue<Integer> pq = new PriorityQueue<>();//stored based on priority(assecending order)
        pq.add(48);
        pq.add(12);
        pq.add(25);
        pq.add(29);
        pq.add(2);
        pq.add(30);
        System.out.println(pq);
        
        System.out.println(pq.peek());//displaying the first elment
        System.out.println(pq.poll());//display as well as delete first element
        System.out.println(pq); 
        
        
        //---------------------------Decreasing order----------------------------------------
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());//stored based on priority(Decreasing order)
        pq1.add(44);
        pq1.add(125);
        pq1.add(19);
        pq1.add(92);
        pq1.add(20);
        pq1.add(30);
        System.out.println(pq1);
        
        //check whether the element is present or not
        System.out.println(pq1.contains(125));
        
        System.out.println(pq1.remove()); //remove first element
        System.out.println(pq1);
        System.out.println("size : "+pq1.size());
        
        //accessing by a iterator
        Iterator itr = pq1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "  ");
            
        }
        
        
    }
}
