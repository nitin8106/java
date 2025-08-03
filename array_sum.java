public class array_sum {

    public static void main(String[] args) {
        float[] marks = {59.5f , 60.5f , 12f,56.5f , 25.5f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }System.out.println(sum);
    }
}