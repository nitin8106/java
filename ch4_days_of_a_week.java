//to print days of a week
import java.util.Scanner;
public class ch4_days_of_a_week {

    public static void main(String[] args) {
        System.out.println("enter day number");
        Scanner SC = new Scanner(System.in);
        int day = SC.nextInt();
        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
        SC.close();


    }
}