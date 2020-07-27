import java.util.regex.*;
public class Example2 {
    public static void main(String[] args) {
        /*Pattern p = Pattern.compile("[a-z]"); //match any lower case alphabet
            0..........a
            3..........b
            4..........z
            8..........p
        
          Pattern p = Pattern.compile("[A-Z]");
                7..........T
                9..........U
        */
        //Pattern p = Pattern.compile("[abc]"); //either a , b or c--->   0.....a   3....b
        //Pattern p = Pattern.compile("[^abc]"); //except a , b or c
        //Pattern p = Pattern.compile("[0-9]"); //any digit from 0 to 9
        //Pattern p = Pattern.compile("[a-z A-Z 0-9]");  //Any alphanumeric symbol
        
        
        Pattern p = Pattern.compile("[^ a-z A-Z 0-9]"); //Except any alphanumerical symbol(special symbol)
        Matcher m = p.matcher("a1@bz9#TpU");
        while(m.find())
        {
            System.out.println(m.start() + ".........."+ m.group());
        }
    }
}
