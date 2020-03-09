/*
 * Program makes use of loops to output different ways of counting up and down
 * depending on the user's input
 * Made by Tarkan Dahi on March 9, 2020
 */

package loops;
import java.util.Scanner ;
/**
 *
 * @author TaDah5199
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyedInput = new Scanner(System.in);
    //variable declaration area
    int num;
    // prompt to the user to enter what kind of loop they would like
        System.out.println("Please enter your choice:");
        System.out.println("1... Count from 0 to 10 by 1");
        System.out.println("2... Count from 100 to 0 by 10");
        System.out.println("3... Count from 50 to 500 by 50");
        System.out.println("4... Count from 6000 to 1000 by 1000");
        
        num = keyedInput.nextInt();
        //below is the different loops they can choose
        //all of these will output a response of what their choice is, then the loop
        if (num == 1) {
            System.out.println("1 is your choice!");
            for (int i = 0; i <= 10; i = i +1)
                System.out.println(i);
        }
        else if (num == 2) {
            System.out.println("2 is your choice!");
            for (int i = 100; i >= 0; i = i - 10)
                System.out.println(i);
        }
        else if (num == 3) {
            System.out.println("3 is your choice!");
            for (int i = 50; i <= 500; i = i +50)
                System.out.println(i);
        }
        else if (num == 4) {
            System.out.println("4 is your choice!");
            for (int i = 6000; i >= 1000; i = i - 1000)
                    System.out.println(i);
        }
        //below is the reply if the user inputs something that was not the option
        else 
        {System.out.println("Sorry, that was not one of the options. Please rerun the program and input 1 of the options");
        
        }
        System.out.println("Thanks for using my program!");
    }
    
}
