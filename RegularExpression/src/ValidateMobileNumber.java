import java.util.regex.*;
import java.util.*;
public class ValidateMobileNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number : ");
        String str = sc.next();
        
        //0 or 91 occurs at most 1 time , then 7,8 or 9 , the 9 digits between 0 to 9
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}"); // or    [0|91]?[789][0-9]{9}
        Matcher m = p.matcher(str);
        
        if(m.find() && m.group().equals(str)) // 1) matched should be there, 2 condtion for length) matched things should be equal with provided string
            System.out.println("Valid Mobile Number");
        else
            System.out.println("Invalid Mobile Number");
    }
}
