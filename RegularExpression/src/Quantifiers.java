import java.util.regex.*;

public class Quantifiers {
    public static void main(String[] args) {
        //a = exactly one 'a'
        //a+ = at least one 'a'
        //a* = any number of 'a' and including 0 also
        //a? = at most 1 'a'
        
        Pattern p = Pattern.compile("a+");//it consider group of 'a' as a single entity
        //sequence of 'a' is single match only
        Matcher m = p.matcher("abaabaaab");
        while(m.find())
            System.out.println(m.start()+"...."+m.group());
        
        System.out.println();
        
        Pattern p1 = Pattern.compile("a*");//Any number of 'a' & Including 0 also
        //sequence of 'a' is single match only
        //cursur move till n + 1 so : at 9 th index, we have left nothing it means 0 'a'
        Matcher m1 = p1.matcher("abaabaaab");
        while(m1.find())
            System.out.println(m1.start()+"...."+m1.group());
        
        System.out.println();
        
        Pattern p2 = Pattern.compile("a?");//At most 1 'a'    zero 'a' or one 'a'
        //cursur move till n + 1 so : at 9 th index, we have left nothing it means 0 'a'
        Matcher m2 = p2.matcher("abaabaaab");
        while(m2.find())
            System.out.println(m2.start()+"...."+m2.group());
        
        
    }
}
