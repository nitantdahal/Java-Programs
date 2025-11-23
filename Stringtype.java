public class Stringtype {
    public static void main(String[] args) {
        String name = "Nischal Nitant Dahal";
        System.out.println("The length of text is: " + name.length());
        System.out.println("The text in upper case: " + name.toUpperCase());
        System.out.println("The length of text is: " + name.toLowerCase());
        System.out.println("The index of text is: " + name.indexOf("Nitant"));
        System.out.println("The character of position is: " + name.charAt(4));

        String txt1 = "Mukti";
        String txt2 = "Mukti";
        System.out.println(txt1.equals(txt2));

        System.out.println("After trim: " + name.trim());
    }
}
