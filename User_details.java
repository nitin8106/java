import java.util.Scanner;

public class User_details {

    public static void main(String[] args) {
        System.out.println("what is your name:");
        Scanner SC = new Scanner(System.in);
        String name = SC.next();
        System.out.println("hello  " +name  + "  have a good day");
        SC.close();
    
    }
}