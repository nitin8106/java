//calculation of tax 
import java.util.Scanner;
public class ch4_tax_calculator {

    public static void main(String[] args) {
        System.out.println("enter your income");
        Scanner SC=new Scanner(System.in);
        float tax=0;
        float income = SC.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5 && income<=5){
            tax = tax + 0.05f*(income-2.5f);
        }
        else if(income>5.0f && income <=10.0f){
            tax = tax + 0.2f*(5.0f - 2.5f);
            tax = tax + 0.05f*(income - 2.5f);
        }
        else if(income > 10.0f){
            tax = tax + 0.2f*(5.0f-2.5f);
            tax = tax + 0.3f*(10.0f-5.0f);
            tax = tax + 0.05f*(income - 10.0f);
        }
        System.out.println("total tax paid is: " + tax);
        SC.close();
        }
}