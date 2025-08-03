public class reverse_array {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int l = array.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int i=0;i<n;i++){
            temp = array[i];
            array[i] = array[l-i-1];
            array[l-i-1] = temp;

        }for(int element: array){
            System.out.println(element + " ");
        }
    }
}
