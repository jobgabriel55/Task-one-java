
package num.pkg5;

import java.util.Scanner;


public class Num5 {

   
    public static void main(String[] args) {
        char operator;
    Double num1, num2, total;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Please choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter your first number");
    num1 = input.nextDouble();

    System.out.println("Enter your second number");
    num2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);
        break;

      // performs subtraction between numbers
      case '-':
        total = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + total);
        break;

      // performs multiplication between numbers
      case '*':
        total = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + total);
        break;

      // performs division between numbers
      case '/':
        total = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + total);
        break;
//declines to provide an output if the operator isn't recognised
      default:
        System.out.println("Your operator is Invalid!");
        break;
    }

    
  }
}

    
    

