import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("enter the number:     ");
        int n;
        n=SC.nextInt();
        int i=1;
        int factorial = 1;
        while(i<=n){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
        SC.close();
    }
}