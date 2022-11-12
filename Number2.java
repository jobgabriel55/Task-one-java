/* This program was done by 21/04321- Job Gabriel
Question two: Task one
*/ 
package number.pkg2;

import java.util.Scanner;


public class Number2 {


    
    public static void main(String[] args) {
        //Create an object scanner
        Scanner input = new Scanner(System.in);
        //Asks the user to enter the first unit
        System.out.println("Enter the grade of your first unit:");
        double num1=input.nextInt();
        //Asks the user to enter the first unit
        System.out.println("Enter the grade of your second unit:");
        int num2=input.nextInt();
        //Asks the user to enter the first unit
        System.out.println("Enter the grade of your third unit:");
        int num3=input.nextInt();
        //Asks the user to enter the first unit
        System.out.println("Enter the grade of your fourth unit:");
        int num4=input.nextInt();
        //Asks the user to enter the first unit
        System.out.println("Enter the grade of your fifth unit:");
        int num5=input.nextInt();
        // performs the sum of the five units
         double sum = num1+ num2+ num3+ num4+ num5 ;
         //performs the average of the five units
        double average = sum /5;
        // Prints out the average grade
        System.out.println("Your average grade is :" +average);
        
    }
    
}
