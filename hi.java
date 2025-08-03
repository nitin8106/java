public class hi {
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b-c;
    }
    public static void main(String[] args) {
        System.out.println("the sum is : "+ sum(3,6));
        System.out.println("the answer is : " +sum(4,5,2));
    }
}
