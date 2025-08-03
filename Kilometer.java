import java.util.Scanner;
public class Kilometer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the distance:");
        double kilometer = sc.nextDouble();
        double miles = kilometer * 0.621371;
        System.out.println(kilometer + " kilometers is equal to " + miles + " miles");
        sc.close();


    }
}