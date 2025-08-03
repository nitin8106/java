import java.util.Scanner;
public class Marks_percentage {
    public static void main(String[] args) {
        int s1,s2,s3,s4,s5, total,percentage;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first subjects marks: ");
        s1=input.nextInt();
        System.out.println("Enter second subject marks: ");
        s2=input.nextInt();
        System.out.println("Enter third subject marks: ");
        s3=input.nextInt();
        System.out.println("Enter fouth subject marks: ");
        s4=input.nextInt();
        System.out.println("enter fifth subject marks: ");
        s5=input.nextInt();
        total = s1 + s2 + s3 + s4 + s5;
        percentage = (total*100/500);
        System.out.printf("%d",percentage);
        input.close();

    }
}