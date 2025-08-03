// what of type of website it is
import java.util.Scanner;
public class type_of_website {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter your website");
        String website = SC.next();
        if(website.endsWith(".org")){
            System.out.println("it is organisational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("it is a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("it is a indian website");
        }
        SC.close();
    }
}