// leap year or not
import java.util.Scanner;
public class leap_year_not {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("enter the year: ");
        int year = SC.nextInt();
        if(year % 4==0){
            System.out.println(" it is a leap year");
        }
        else{
            System.out.println("not a leap year");
        }
        SC.close();
    }
}