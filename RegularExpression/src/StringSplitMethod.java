//String has split method to split the string according to pattern
//string's split method takes an pattern as Argument and pattern's split method takes Target string as a argument
public class StringSplitMethod {
    public static void main(String[] args) {
        String str = "Dharmendra namdev MCA";
        String s[] = str.split("\\s");
        for(String s1 : s)
        {
            System.out.println(s1);
        }
        System.out.println();
    }
}
