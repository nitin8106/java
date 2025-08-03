//print array in reverse order
public class array2method {

    public static void main(String[] args) {
        int[] marks = {20,03,40,89,39,99};
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}