/*

HashMap : 1) since it implements Map interface 
          2) It stores the data in (Key, Value) pairs.
          3) HashMap doesn’t allow duplicate keys but allows duplicate values
          4) HashMap allows null key also but only once and multiple null values
          5) 
*/
package map;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(12, "Nitesh");
        hm.put(31,"Dharmendra");
        hm.put(30, "Rohit");
        hm.put(17,"Himanshu");
        hm.put(19, "Jitendera Rajput");
        //only one time null key allowed
        hm.put(null, "Ramdev");
        
        //multiple time null values allowes
        hm.put(40, null);
        hm.put(42, null);
        
        hm.put(3, "Bhag Gya");
        
        System.out.println(hm);
        
        
        
        
    }
}
