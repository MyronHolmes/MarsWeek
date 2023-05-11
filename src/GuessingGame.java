import java.util.Optional;
import java.util.Scanner;

public class GuessingGame {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hello player, what's your name?");
        System.out.println("(Enter your name)");
        String userName = input.nextLine();
    }
}
