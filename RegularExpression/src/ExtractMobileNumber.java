import java.util.*;
import java.io.*;
import java.util.regex.*;

public class ExtractMobileNumber {
    public static void main(String[] args) throws IOException{
        
         Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
         PrintWriter pw = new PrintWriter("output.txt");
         BufferedReader br = new BufferedReader(new FileReader("input.txt"));
         
         String line = br.readLine(); //reads 1 line from input file
         while(line != null)
         {
             Matcher m = p.matcher(line);
             
             while(m.find()) //one line can have multiple mobile no ,so we use loop
             {
                 pw.println(m.group());
                 //pw.write(m.group()); //just print without any space
             }
             line = br.readLine();
         }
         pw.flush();
         pw.close();
         br.close();
         
    }
}
