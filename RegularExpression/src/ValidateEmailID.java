import java.util.regex.*;
import java.util.*;
public class ValidateEmailID {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email ID : ");
        String str = sc.next();
        
        
        Pattern p = Pattern.compile("[a-zA-z0-9][a-zA-z0-9_.]*@[a-zA-z0-9]+([.][a-zA-z]+)+");
                                   // dharmen_namdev.mca@gmail.com
                                   // 123dharmen_namdev.mca@gmail.co.in
        Matcher m = p.matcher(str);
        
        if(m.find() && m.group().equals(str)) // 1) matched should be there, 2 condtion for length) matched things should be equal with provided string
            System.out.println("Valid Mail ID");
        else
            System.out.println("Invalid Mail ID");
    }
}
