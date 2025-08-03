//marks of a student
import java.util.Scanner;
public class ch4_practise_2 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("enter marks of physics: "); 
        byte m1=SC.nextByte();
        System.out.print("enter marks of maths: ");
        byte m2=SC.nextByte();
        System.out.print("enter marks of chemistry: ");
        byte m3=SC.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your percentage is: " + avg);
        if(avg >= 40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("you are passed");
        }
        else{
            System.out.println("you are failed");
        }
        SC.close();

    }
}