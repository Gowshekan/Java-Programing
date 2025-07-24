import java.util.Scanner;
import.java.io.file;

public class fileinput {
    public static void main ( String [] args)
    {
         File file =new File("sample.java");
         try{
            Scanner sc =new scanner(file);
            while(sc.hasNextLine())
            {
                string str=sc.nextLine();
                System.out.println(str);

            }
            sc.close();
         }
    }
}