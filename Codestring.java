public class Codestring {

    public static void main(String[] args) {
        String name = "Nitin";
        System.out.println(name);
        
        int value = name.length();
        System.out.println(value);
        String ls = name.toLowerCase();
        System.out.println(ls);
        String us = name.toUpperCase();
        System.out.println(us);
        String nontrimmedstring = "   NEELESH   ";
        System.out.println(nontrimmedstring);
        System.out.println(nontrimmedstring.trim());
        System.out.println(name.substring(2));// index starts from zero
        System.out.println(name.substring(2,4));//end index is not included
       System.out.println(name.replace('t','i'));//take single quotes
       System.out.println(name.startsWith("Ni"));
       System.out.println(name.endsWith("tin"));
       System.out.println(name.charAt(2));
       System.out.println(name.indexOf('i'));
       System.out.println(name.equalsIgnoreCase("nitin"));
    }
}