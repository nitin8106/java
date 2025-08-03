public class present_in_array_or_not {
    public static void main(String[] args) {
        float[] marks = {59.5f , 60.5f , 12f,56.5f , 25.5f};
        boolean isInarray = false;
        float number = 60.5f;
        for(float element : marks){
            if(element == number){
                isInarray = true;
                break;
            }

        }if(isInarray){
            System.out.println("present");
        }else{
            System.out.println("nont present");
        }

    }
}
