import java.util.regex.*;
public class SplittingString
{
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("\\s");//spilit the string respect to space  ' ' 
        //Pattern p = Pattern.compile("a");//spilit the string respect to 'a'
        Pattern p = Pattern.compile("m");//spilit the string respect to 'm' 
        String str[] = p.split("Dharmendra Namdev MCA");
        for (String string : str) {
            System.out.println(string);
        }
        
        Pattern p1 = Pattern.compile(".");// '.' represents every character, so it will split based on every character
                                          //print nothing
        String str1[] = p1.split("www.google.com");
        for (String string : str1) {
            System.out.println(string);
        }
        
        Pattern p2 = Pattern.compile("\\.");//  or [.]  // we know '.' represents every character, but here it is a symbol '.'
                                          //print nothing
        String str2[] = p2.split("www.google.com");
        for (String string : str2) {
            System.out.println(string);
        }
    }
}