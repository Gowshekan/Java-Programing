/*Inheritance and polymorphism
*/
class B{
    public static void display() {
        System.out.println("Hello from Display function of class B");
    }
}
class A{
    static{
    System.out.println("Hello");
    }
    public static void main(String[] args) {
        {
            System.out.println("Hi");
        }
    }
}

public class StaticExample {
    public static void main(String[] args) {
        System.out.println("Hello from StaticExample main method");
        A a = new A();
        B.display();
    }
}