import java.util.Scanner;
public class factorial_another_method {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the number");
        int n;
        n=SC.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++)
       factorial = factorial * i;
       System.out.println(factorial);
       SC.close();
    }
    
}