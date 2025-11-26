public class Interest {
    public static void main(String[] args) {
        float Principal = 500f;
        float Rate = 3.5f;
        int Time = 5;

        double Interest = (Principal * Rate * Time)/100;

        System.out.println("Principal Amount is " + Principal);
        System.out.println("Rate is " + Rate + "%");
        System.out.println("Time is " + Time + " years");
        System.out.println("Simple Interest is " + Interest);
    }
}