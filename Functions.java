import java.util.Scanner;
public class Functions {
    public static void MyNameIs(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String name = SC.next();
        MyNameIs("your name is : " + name);
        SC.close();
    
    }


    
}