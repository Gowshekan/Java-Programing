import java.util.Scanner;
import java.io.*;

public class fileinput {
    public static void main ( String [] args)
    {
         File file =new File("sample.txt");
         try{
            Scanner sc =new Scanner(file);
            while(sc.hasNextLine())
            {
                String str=sc.nextLine();
                System.out.println(str);

            }
            sc.close();
         }
         catch(Exception e) {
             System.out.println(("file not found"));

         }
    }
}