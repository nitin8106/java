import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("enter the number of table: ");
        int n;
        n=SC.nextInt();
        for(int i=1;i<11;i++){
            System.out.printf("%d x %d = %d\n", n,i,n*i);
        }
        SC.close();
        
    }
    
}
