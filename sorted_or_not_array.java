public class sorted_or_not_array {
    public static void main(String[] args) {
        int [] array = {1,2,3,12,33,56};
        boolean isSorted = true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isSorted = false;
                break;
            }

        }
            if(isSorted){
                System.out.println("the list is sorted");
            }
            else{
                System.out.println("the list is not sorted");
            }
    }
}
