
package list;
//stack directly doesn't use list interface, it extends the Vector class(which implements list interface)
//hence Stack has the property of both list interface and Vector class
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        
        //Adding or pushing the element into stack
        stk.add("Dharmendra");
        stk.add("farheen");
        stk.add("Quazi");
               //or push
        stk.push("Ramdev");
        stk.push("Himani");
        
        System.out.println("stack:"+stk);
        
        //size
        System.out.println("size :"+stk.size());
        
        //peek :  it return top element
        System.out.println("top element:"+stk.peek());
        
        System.out.println("remove top elements untill stack is empty");
        while(!stk.empty())
        {
            System.out.println(stk.pop());
        }
        //nothing
        System.out.println(stk);
    }
}
