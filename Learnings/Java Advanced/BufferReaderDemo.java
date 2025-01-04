import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.util.Scanner;
public class BufferReaderDemo {

    static InputStreamReader inp = new InputStreamReader(System.in);
    static BufferedReader b = new BufferedReader(inp);

    static void demo() throws IOException {
       
        System.out.print("Enter something :");
        String str = b.readLine();
        System.out.println(str);
        b.close();//it suggested to close the resources always.
        //resource/connections to DB closing should be in final block...
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