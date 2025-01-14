
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) {
        System.out.println("Main of FileHandlingDemo()");

        try {
            File f = new File("randomfile.class");
            f.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fw = new FileWriter("randomfile.class");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text to write to randomfile.class");
            String input = "";
            while(true)
            {
                System.out.println("Enter something:");
                String temp = sc.nextLine();
                input = input + temp;
                if(temp.trim().isEmpty())
                {
                    break;
                }
            }
            System.out.println(input);
            fw.write(input);
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //
        }

    }
}