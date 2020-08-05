
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<String>();
        //Dynamically grow and shrink
        //since, ArrayList Implements list interface which allows us to keep 1) duplicate elements in array list
        // 2) null value  3)preserved insertion order
        arrlist.add("Toyota");
        arrlist.add("BMW");
        arrlist.add("oddy");
        arrlist.add("Mahindra");
        arrlist.add("Maruti");
        arrlist.add(null);
        System.out.println("arr list : "+arrlist);
        
        
        System.out.println("Using For loop : ");
        for (String item : arrlist) {
            System.out.print(item+" ");
        }
        System.out.println();
        
        
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Dharmendra");
        alist.add("Raj");
        alist.add("Amit");
        alist.add("Kishan");
        alist.add("Devya");
        for(int i = 0; i < alist.size(); i++)
        {
            System.out.print(alist.get(i)+" ");
        }
        
        //Remove
        alist.remove("Amit");
        //or  alist.remove(2);
        System.out.println();
        System.out.println("After Removing the element name 'Amit' : "+alist);
        
        //adding elment at index 2
        alist.add(2,"Ashutosh");
        System.out.println("Adding elment at index 2 : "+ alist);
        
        //adding one list to another list
        alist.addAll(2, arrlist);
        System.out.println("After adding arrlist to alist, alist is :"+alist);
        
        System.out.println("find index of 'Raj' : "+alist.indexOf("Raj"));
        
        System.out.println("find index of 'Rajkumar' : "+alist.indexOf("Rajkumar"));
        
        
        
        //----------------------sorting--------------------------
        // for sorting the elments, firstly we have to remove all null elments 
        alist.remove(null);
        System.out.println(alist);
        
        //sorting the vector elements
        Collections.sort(alist);
        System.out.println("Sorted Arrray List : "+ alist);
        
        
        
    }
}
