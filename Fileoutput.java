import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Fileoutput {
     public static void main(String[] args)
     {
        try
        {
            FileWriter fw=new FileWriter("input.txt",false);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            pw.println("welcome to java progamming");
             pw.println("welcome to java progamming and c++");
             bw.close();
             pw.close();
             fw.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }
}