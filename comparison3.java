import java.util.Scanner;

public class comparison3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Three numbers:");
        double a, b, c; 
        a =sc.nextDouble();
        b =sc.nextDouble();
        c =sc.nextDouble();
        if (a > b && a > c) {
            System.out.print("a is the greatest number");

        }
        else if (b > a && b > c) {
            System.out.print("b is the greatest number");

        }
        else 
        {
            System.out.print("c is the greatest number");

        }
        
        
    }
}