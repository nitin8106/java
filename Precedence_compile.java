import java.util.Scanner;
public class Precedence_compile {
    public static void main(String[] args) {
        int a,b;
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the number1");
        a=SC.nextInt();
        System.out.println("enter the number2");
        b=SC.nextInt();
        int k=a/b-b*a;
        int l=b/a-b*a;
        System.out.println(k);
        System.out.println(l);
        SC.close();
    }
}
