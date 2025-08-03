public class array2d {

    public static void main(String[] args) {
        int [][] flats = new int[2][2];
        flats[0][0] = 101 ;
        flats[0][1] = 102 ;
        flats[1][0] = 201 ;
        flats[1][1] = 202 ;
        System.out.println("printing using 2-d array");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i] [j] + " ");
            }
            System.out.println();
        }
    }
}