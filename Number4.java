
package number.pkg4;


public class Number4 {

    
    public static void main(String[] args) {
        // Numbers that are divisible by 2 will be introduced via the below statement
       System.out.println(" \nNumbers that are divisible by 2 are:");
       // The range of the numbers from 71 to 150 are represented here using the for loop
       for (int i=71; i<150; i++){
           // Performs whether the numbers are divisible by 2
           if (i%2==0)
               System.out.print(i+",");
       }
        // Numbers that are divisible by 3 will be introduced via the below statement
            System.out.println(" \nNumbers that are divisible by 3 are:");
            // The range of the numbers from 71 to 150 are represented here using the for loop
       for (int i=71; i<150; i++){
             // Performs whether the numbers are divisible by 3
           if (i%3==0)
               System.out.print(i+",");
       }
        // Numbers that are divisible by 7 will be introduced via the below statement
            System.out.println(" \nNumbers that are divisible by 7 are:");
            // The range of the numbers from 71 to 150 are represented here using the for loop
       for (int i=71; i<150; i++){
             // Performs whethe the numbers are divisible by 2
           if (i%7==0)
               System.out.print(i+",");
    }
    
}
}