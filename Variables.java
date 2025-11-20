// Finding area and perimeter of rectangle

public class Variables {
    public static void main(String[] args) {
        int length = 5;
        int width = 6;

        // Formula to find area and perimeter of rectangle 
        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        
        System.out.println("Total perimeter of rectangle = " + perimeter);
        System.out.println("Total area of rectangle = " + area);
    }
} 