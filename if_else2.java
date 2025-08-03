import java.util.Scanner;
public class if_else2 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter any number");
        int number = SC.nextInt();
        if(number>=100)
        {
            System.out.println("larger");
        }
        else{
            System.out.println("smaller");
        }
        SC.close();
    }
}