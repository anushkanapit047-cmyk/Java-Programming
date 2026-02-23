import java.util.*;

public class result {
public static void main(String args []) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the marks of the student: ") ; 
    int marks = sc.nextInt() ;
    String grade = marks >= 33 ? "Pass" : "Fail" ;
    System.out.println("The grade of the student is: " + grade) ;
}
}