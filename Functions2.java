import java.util.Scanner;
public class Functions2 {
    public static int  CalculateSum (int a , int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a,b;
        System.out.print("enter the value of a : ");
        a = SC.nextInt();
        System.out.print("enter the value of b : ");
        b =SC.nextInt();
        int sum = CalculateSum(a,b);
        System.out.println("the sum is : " + sum);
        SC.close();


    }
    

}