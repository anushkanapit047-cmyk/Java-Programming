import java.util.*;

public class costofitems {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pen");

        float item1 = sc.nextFloat();
        System.out.println("Enter the cost of pencil");

        float item2 = sc.nextFloat();
        System.out.println("Enter the cost of eraser");
        float item3 = sc.nextFloat();
        float totalcost = item1 + item2 + item3 ;
        float tax = 18/100f * totalcost; 
        System.out.print("Total cost of three items is " + (totalcost + tax)); 
    }
}
