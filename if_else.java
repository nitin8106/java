import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        if(age >= 18)
        {
            System.out.println("eligible");
        }
        else
        {
            System.out.println("not eligible");
        }
        input.close();
    }

    
}