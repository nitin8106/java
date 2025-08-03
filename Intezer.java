
import java.util.Scanner;
public class Intezer {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.hasNextInt());
        input.close();

    }
}