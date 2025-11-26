public class Ifelse {
    public static void PosNeg (int a) {
        if (a > 0) {
            System.out.println("Number is positive.");
        }
        else if (a == 0) {
            System.out.println("Number is zero.");
        }
        else {
            System.out.println("Number is Negative.");
        }
    }
    public static void main (String[] args) {
        PosNeg(6);
    }
}
    
