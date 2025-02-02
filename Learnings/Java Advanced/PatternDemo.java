
import java.util.Scanner;
import java.util.regex.*;

public class PatternDemo
{

    static void demo1()
    {
        String a = "Hello,world";
        // Pattern pat = Pattern.compile("world", Pattern.CASE_INSENSITIVE);
        Pattern pat = Pattern.compile("Hey world");
        Matcher mat = pat.matcher(a);
        boolean found = mat.find();
        System.out.println(found);
    }
    static void demo2()
    {
        Scanner sc = new Scanner(System.in);

        while(!sc.nextLine().equalsIgnoreCase("stop"))
        {
            System.out.println("Enter regex");
            String regex= sc.nextLine();
            System.out.println("Enter input");
            String input = sc.nextLine();
            System.out.println("regex :" + regex + ", input:" + input);

            boolean matches = Pattern.compile(regex,Pattern.CASE_INSENSITIVE).matcher(input).matches();
            System.out.println("matches :" + matches);

            boolean find = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(input).find();
            System.out.println("find :" + find);
            
        }   
        sc.close();     

    }


    public static void main(String args[])
    {
        System.out.println("Pattern2 Demo main");

        demo2();
 
    }


}