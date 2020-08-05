package queue;
//1) ArrayDeque provides a way to apply resizable-array in addition to the implementation of the Deque interface. 
//2) It is also known as Array Double Ended Queue or Array Deck : allows us to add or remove an element from both sides of the queue
//3) They are not thread-safe which means that in the absence of external synchronization, 
//   ArrayDeque does not support concurrent access by multiple threads.
//4) Null elements are prohibited in the ArrayDeque.
//5) ArrayDeque class is faster than Stack when used as a stack.
//6) ArrayDeque class is faster than LinkedList when used as a queue.
//7) Preserved Insertion Order
//--------------------------Dequeue : Double ended Queue---------------
import java.util.ArrayDeque;
import java.util.Iterator;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrDeque = new ArrayDeque<>();
        arrDeque.add(52);
        arrDeque.add(45);
        arrDeque.add(2);
        arrDeque.add(21);
        arrDeque.add(82);
        arrDeque.add(12);
        //arrDeque.add(null); //error : not allowed
        arrDeque.add(2); //duplicate alow
        arrDeque.add(67);
        
        System.out.println(arrDeque);
        
        //since it is dequeue insertion is possible from both end
        arrDeque.addFirst(90);
        arrDeque.addLast(6);
        System.out.println(arrDeque);
        
        //since it is dequeue deletion is possible from both end
        arrDeque.removeFirst();
        arrDeque.removeLast();
        System.out.println(arrDeque);
        
        //remove first occurances of element
        arrDeque.removeFirstOccurrence(2);
        System.out.println(arrDeque);
        
        //access first element
        System.out.println(arrDeque.peek());
        
        //access element using iterator
        Iterator itr = arrDeque.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+"   ");
        }
    }
}
