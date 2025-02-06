
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

    static void demo3()
    {
        Scanner sc = new Scanner(System.in);
        while(!sc.nextLine().equalsIgnoreCase("stop"))
        {
            System.out.println("Enter regex");
            String regex= sc.nextLine();
            System.out.println("Enter input");
            String input = sc.nextLine();
            System.out.println("regex :" + regex + ", input:" + input);
            Pattern pat = Pattern.compile(regex);
            Matcher mat = pat.matcher(input);
            while(mat.find())
            {
                System.out.println("regex : " + regex + "is found in " + "input :" +  input + " found at " + mat.start());
            }

            boolean matches = Pattern.compile(regex,Pattern.CASE_INSENSITIVE).matcher(input).matches();
            System.out.println("matches :" + matches);

            boolean find = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(input).find();
            System.out.println("find :" + find);
        }
        sc.close();

    }
    
    static void demo4()
    {
        // System.out.println("try w and w ww www wwwww for regex and pattern");
        Scanner sc = new Scanner(System.in);
        while(!sc.nextLine().equalsIgnoreCase("stop"))
        {
            System.out.println("Enter regex");
            String regex= sc.nextLine();
            System.out.println("Enter input");
            String input = sc.nextLine();
            System.out.println("regex :" + regex + ", input:" + input);
            Pattern pat = Pattern.compile(regex + "+");
            // Pattern pat = Pattern.compile(regex);
            Matcher mat = pat.matcher(input);
            boolean matches = Pattern.compile(regex,Pattern.CASE_INSENSITIVE).matcher(input).matches();
            System.out.println("matches :" + matches );

            // boolean find = mat.find();
            // System.out.println("find :" + find + " : " +  mat.group() );

            while (mat.find()) {
                System.out.println("found :" +  mat.group(0) + " at " + mat.start());
                // System.out.println(mat.group());
            }
        }
        sc.close();
    }
    
    static void demo5()
    {

        Scanner sc = new Scanner(System.in);
        while(!sc.nextLine().equalsIgnoreCase("stop"))
        {
            System.out.println("Enter like [e.+d] => pattern for word starting with e and ending with d");
            System.out.println("e.+d => only longest match...prints all string");
            System.out.println("e.+?d =>fetches match properly");
            String input = "end is beginning, end is ended";
            // Pattern pat = Pattern.compile("e.+d");//only longest match...prints all string.
            Pattern pat = Pattern.compile("e.?d");
            Matcher mat = pat.matcher(input);
            // boolean matches = Pattern.compile(regex,Pattern.CASE_INSENSITIVE).matcher(input).matches();
            // System.out.println("matches :" + matches );
            while (mat.find()) {
                System.out.println("found :" +  mat.group(0) + " at " + mat.start());
                
                // System.out.println(mat.group());
            }
        }
        sc.close();
    }
    public static void main(String args[])
    {
        // https://www.w3schools.com/java/java_regex.asp
        System.out.println("Pattern2 Demo main");

        // demo1();
        // demo2();
        // demo3();
        // demo4();
        // demo5();

        String str = "8122226";
        System.out.println(str.matches("8*6"));
 
    }


}