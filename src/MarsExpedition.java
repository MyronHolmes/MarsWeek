import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition() throws InterruptedException {

        Scanner input = new Scanner(System.in);

        String[][] vehicles = {
                {"Star-Light"},
                {"SpaceXO-289"},
                {"Nanotron"},
                {"Jaded Moon"}
        };


        System.out.print("Loading In 3");
        Thread.sleep(1000);
        System.out.print("...2");
        Thread.sleep(1000);
        System.out.print("...1");
        Thread.sleep(1000);
        System.out.print("...");
        Thread.sleep(1000);
        System.out.println("Expedition Prep Program loaded. Please enter your name\n");
        String name = input.nextLine();

        System.out.println("Hi " + name + " Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N\n");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("y")){
            System.out.println("I knew you would say that. You are team leader for a reason.\n");
        } else if(answer.equalsIgnoreCase("n")){
            System.out.println("Too bad you are team leader. You have to go.\n");
        }

        System.out.println("How many people are there joining you?\n");
        int team = input.nextInt();
        if(team > 2){
            System.out.println("That’s way to many people. We can only send 2 more members.\n");
        }else if(team == 2){
            System.out.println("Great answer!\n");
        }else {
            System.out.println("That's not enough we need you plus two more members.\n");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?\n");
        String throwAway = input.nextLine();
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.\n");

        System.out.println("Now, select a letter as you will need a vehicle for your journey: \n");
        System.out.println("A. " + vehicles[0][0]);
        System.out.println("B. " + vehicles[1][0]);
        System.out.println("C. " + vehicles[2][0]);
        System.out.println("D. " + vehicles[3][0] + "\n");
        String vehicleType= input.nextLine();
        String vehicleChoice = null;

        if(vehicleType.equalsIgnoreCase("a")){
            System.out.println("Great choice, " + vehicles[0][0] + " is super fast.\n");
            vehicleChoice= vehicles[0][0];

        }else if( vehicleType.equalsIgnoreCase("b")){
            System.out.println("Perfect, " + vehicles[1][0] + " is great for expeditions.\n");
            vehicleChoice= vehicles[1][0];

        }else if(vehicleType.equalsIgnoreCase("c")){
            System.out.println("Sweet selection, " + vehicles[2][0] + " has multiple adaptable features.\n");
            vehicleChoice= vehicles[2][0];

        }else if(vehicleType.equalsIgnoreCase("d")){
            System.out.println("Heads up, " + vehicles[3][0] + " needs an oil change.\n");
            vehicleChoice= vehicles[3][0];

        }else{
            System.out.println("That wasn't an option so you'll be walking\n");
            vehicleChoice= "Your feet";
        }

        System.out.println(name + " you're all set! " +
                "\nYour team consists of 3 people total," +
                "\nYou've chosen " + snack + ", as your snack on the expedition," +
                "\nAnd you will be taking " + vehicleChoice + "." +
                "\nExpedition team heads out in:");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("GO!");

        input.close();
    }
}
