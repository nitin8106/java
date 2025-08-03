public class multiplication_table_methods_ {

    static void mult_table(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        mult_table(9);
    }
}