import java.util.regex.*;
import java.io.*;

public class DisplayTXTFileNameInDirectory {
    public static void main(String[] args) throws IOException{
        File f = new File("C:\\Users\\Dharmendra\\Documents");
        
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9$._]*[.]txt");//Regular expression of .txt file
        String str[] = f.list();
        int count = 0;
        for (String s1 : str) {
            Matcher m = p.matcher(s1);
            if(m.find() && m.group().equals(s1))
            {
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("No of .txt file is : "+count); 
    }
}
