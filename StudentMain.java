import java.util.Scanner;
public class StudentMain
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Integer size=Integer.valueOf(sc.nextLine());
        Student [] arr = new Student[size];

        Integer id;
        String name;
        Student s;

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the " +(i+1)+ "Student Data");
            System.out.println("id :");
            id = Integer.valueOf(sc.nextLine());
            System.err.println("Name :");
            name=sc.nextLine();
            s = new Student(id,name);
            arr[i]=s;
        }
        for(Student s1:arr)
        {
            System.out.println(s1);
        }
    }
}