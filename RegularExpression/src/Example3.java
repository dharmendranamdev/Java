import java.util.regex.*;
import java.util.regex.Pattern;
public class Example3 {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("\\s"); //space character only
        //Pattern p = Pattern.compile("\\S");  //Any non space character
        //Pattern p = Pattern.compile("\\d");   //any Digit from 0 to 9
        ///Pattern p = Pattern.compile("\\D");    //except Digit
        
        //Pattern p = Pattern.compile("\\w"); //any alphanumerical symbo a-z A-z and 0-9
        //Pattern p = Pattern.compile("\\W");  //any special character
        Pattern p = Pattern.compile(".");  //all characters
        Matcher m = p.matcher("a7# bTY @9");
        
        while(m.find())
        {
            System.out.println(m.start()+"......."+m.group());
        }
        
    }
}
