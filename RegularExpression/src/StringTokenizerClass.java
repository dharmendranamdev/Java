import java.util.*;
public class StringTokenizerClass {
    public static void main(String[] args) {
        //We can get tokens by both method such as hasMoreTokens & hasMoreElements
        //By default StringTokenizer split the string based on by default pattern ' ' space
        StringTokenizer s = new StringTokenizer("Dharmendra Namdev MCA UOH");
        while (s.hasMoreTokens()) {
            Object data = s.nextToken();
            System.out.println(data);
            
        }
        System.out.println();
        
        s = new StringTokenizer("COA OS TOC DBMS AI BDS");
        while (s.hasMoreElements()) {
            Object nextElement = s.nextElement();
            System.out.println(nextElement);
        }
        
        System.out.println();
        
        s = new StringTokenizer("31-March-1997","-");  //here '-' hyphen  = Pattern / RE / Delim
        while (s.hasMoreElements()) {
            System.out.println(s.nextElement());
        }
        
        
    }
}
