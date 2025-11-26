public class Ageavr {
    public static void main(String[] args) {
        int[] age = {23, 32, 44, 22, 25, 21, 43};
        int countAge = 7;
        int sum = 0;
        
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        System.out.println(sum);

        int avg = (sum / countAge);
        System.out.println(avg);
    }
}
