/*

HashMap : 1) since it implements Map interface 
          2) It stores the data in (Key, Value) pairs.
          3) HashMap doesn’t allow duplicate keys but allows duplicate values
          4) HashMap allows null key also but only once and multiple null values
          
Linked Hash Map : 1) follow the same properties of HashMap but preserve the insertion order by using doubly linked list

*/
package map;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
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
        
        //remove 30 key
        System.out.println(hm.remove(30));
        System.out.println(hm);
        
        //check whether the key is present or not
        System.out.println(hm.containsKey(31));
        System.out.println(hm.containsKey(89));
        
        
        //check whether the value is present or not
        System.out.println(hm.containsValue("Dharmendra"));
        System.out.println(hm.containsValue("Vijiy"));
        
        
        //if value is not present at given key , so it replace the value with given value
        hm.putIfAbsent(40, "sonu");
        System.out.println(hm);
        
        
        //modify value
        hm.replace(31, hm.get(31) + " Namdev");
        hm.put(12, "Nitesh Rawal");
        
        System.out.println(hm);
        
        
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key : "+key + " value:"+value); 
        }
        
       
        
    }
}
