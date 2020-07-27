//pattern() method of Matcher in Java with Examples
import java.util.regex.*;
public class Example1 {
    public static void main(String[] args) {
        
        int count = 0;
        Pattern  p = Pattern.compile("ab"); //Pattern or RE //we are seraching for "ab"
        Matcher m = p.matcher("ababbaba"); //Target string  //Where we have to match the pattern
        while(m.find())
        {
            count++;
            System.out.println(m.start() + "..."+ m.end() + "..."+m.group());
            //start index, end index + 1,  which thing is matched
        }
        System.out.println("No of Ocuureces : "+count);
        
        
    }
}
