public class int_arguement {

    static int sum(int...arr){
        int result = 0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the sum is :" + sum(2,3));
        System.out.println("the result is " + sum(2,34,6,3));
    }
}