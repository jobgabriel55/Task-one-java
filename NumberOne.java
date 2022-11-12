/* This program was done by 21/04321- Job Gabriel
Question one Task one
*/ 
package number.one;

import java.util.Scanner;


public class NumberOne {
   static  String name;
    static int age;
    public static void main(String[] args) {
        //Create an object scanner
        Scanner input=new Scanner(System.in);
        //Ask the user to enter his Surname
       System.out.println(" Enter your surname " );
         name = input.nextLine();
         // Performs the calculation of the number of characters on the surname
      int namelength = name.length();
      // displays the numbers of the characters of the Surname
      System.out.println(" The number of letters in your surname is: "+namelength);
      
       
       //Asksthe user to enter the age
       
       System.out.print("Enter your age: ");
       
        int num = input.nextInt();
// this boolean expression checks the even number and if the number %2 is equal to 0 by the use of if statement 
        if(num % 2 == 0)
            // if true it prints out this output
            System.out.println(num + " is an even number");
        else
            //if false it prints out this output
            System.out.println(num + " is an odd number");
    }
       }
    
    

