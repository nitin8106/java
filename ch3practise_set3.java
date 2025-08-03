public class ch3practise_set3 {

    public static void main(String[] args) {
        String letter="Dear <|name|> thanks a lot";
        letter=letter.replace("<|name|>", "nitin");
        System.out.println(letter);
        String dsts="my name is  nitin";
        System.out.println(dsts.indexOf("  "));
        System.out.println(dsts.indexOf("   "));
        String letter2="dear nitin,\n\t this course is very nice\n\t thanks";
        System.out.println(letter2);
    }
}   