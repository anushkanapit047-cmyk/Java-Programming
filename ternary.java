import java.util.*;

public class ternary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("ZERO IS NEITHER EVEN NOR ODD");
        }
         
        else if (num < 0 ) {
            System.out.println("NEGATIVE NUMBER IS NEITHER EVEN NOR ODD");
        }
        
        else { String result = (num % 2 == 0)? "EVEN" : "ODD"; {
            System.out.println(result);
        }
        } 
    }
}
