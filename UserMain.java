import java.util.Scanner;
public class UserMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=Integer.parseInt(sc.nextLine());
        User[] arr = new User[size];
        String id=Integer.parseInt(sc.nextLine());

        for(int i=0;i<size;i++)
        {
            System.out.println("ID");
            id=sc.nextLine();
            System.out.println("Name");
            name=sc.nextLine();
            System.out.println("Adsress");
            address=sc.nextLine();
            mobileno=sc.nextLine();

            u=new User(id, name, address, mobileno);
            arr[i]=u;
        }
        
        for(User u:arr)
        {
            System.setOut(u);
        }

    }    
}