import java.util.Scanner;
public class multiplication_table_reverse_order {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("enter the number you want: ");
        int n;
        n=SC.nextInt();
        for(int i=10;i>0;i--){ 
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
        SC.close();
    }
}