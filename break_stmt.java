public class break_stmt {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==2){
            System.out.println("end of loop");
            break;
            }
        }
    }
}
