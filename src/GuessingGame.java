import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Hello player, what's your name?");
        System.out.println("(Enter your name)");
        String userName = input.nextLine();

        System.out.println(userName + " I am thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");


        int number = rand.nextInt(100);
        int tries = 0;

        while (true){
            int guess;

            try{
                guess = input.nextInt();
            }catch (InputMismatchException e){
                String badInput = input.next();
                System.out.println("That is not a integer, please try again");
                continue;
            }

            if(guess > 100 || guess < 1){
                System.out.println("The number " + guess + " is out of range weirdo");
                continue;
            }

            tries++;

            if (guess > number ){
                System.out.println("Sorry " + guess + " is too high, try again.");
            }else if (guess < number){
                System.out.println("Sorry " + guess + " is too low, try again.");
            }else if (guess == number){
                System.out.println("Well done " + userName);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }

        }

    }
}
