import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.util.Scanner;
public class BufferReaderDemo {

    
    static void demo() throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(inp);
        System.out.print("Enter something :");
        String str = b.readLine();
        System.out.println(str);
        System.out.println("toLowerCase :" + str.toLowerCase());
        System.out.println("toUpperCase:" + str.toUpperCase());

        if (str.equals("throw"))
            throw new IOException("Throwing custom exception");
        else    
            System.out.println("if you want exception, you can enter throw next time");
    }

    public static void main(String[] args) {
        System.out.println("Main");

        try {
            System.out.println("Lets try demo()");
            demo();
        }
        catch(IOException e) 
        {
            System.out.println("catching the Exception   : " + e);
            System.out.println("the message in exception  : " + e.getMessage());
        } 
        finally {
            System.out.println("Ops finally");
        }
    }

}