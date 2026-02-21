import java.util.*;

public class squarearea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.print("the area of the square is this " + area);
    }
} 