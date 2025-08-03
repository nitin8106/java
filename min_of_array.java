public class min_of_array {
    public static void main(String[] args) {
        int [] array = {10,2,3,4,55};
        int min = array[0];
        for(int element: array){
            if(element <  min){
            min = element;
        }
    }
        System.out.println("the minimun number is " + min);
    }
}
