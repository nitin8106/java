import java.util.Scanner;
public class switch_stmt {

    public static void main(String[] args) {
        int age;
        System.out.print("enter your age: ");
        Scanner SC=new Scanner(System.in);
        age = SC.nextInt();
        switch (age) {
            case 18:
            System.out.println("you are eligible to vote");
                break;
            case 21:
            System.out.println("yor eligible for job");
                break;
            default:
            System.out.println("not eligible");
                break;
        }
        SC.close();
    }
}