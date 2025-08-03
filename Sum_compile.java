import java.util.Scanner;
public class Sum_compile {

    public static void main(String[] args) {
        int a,b,sum;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:1");
        a = input.nextInt();
        System.out.println("enter the number:2");
        b = input.nextInt();
        input.close();
        sum = a + b;
        System.out.printf("%d + %d = %d",a,b,sum);
    }
}