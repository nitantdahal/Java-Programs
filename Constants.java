public class Constants {
    public static void main(String[] args) {
        int x = 5;
        x = 10; // x value updated to 10
        System.out.println(x); // prints 10

        final int a = 10; // final keyword make value constant within the program
        // a = 2; // Value not updated to 2 (Shows error)
        System.out.println(a);
    }
}