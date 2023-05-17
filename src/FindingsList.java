import java.lang.reflect.Array;
import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        Thread.sleep(500);

        System.out.println("Welcome back from your expedition. Time to catalog everything you found.\n");
        ArrayList<String> rockList= new ArrayList<>();
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");
        System.out.println("Expedition rock findings download confirmed\n");
        System.out.println(rockList + "\n");
        System.out.println("Unknown item found in rockList: " + rockList.get(3) + "\nPlease remove this item to proceed.\n");
        rockList.remove(3);
        System.out.println(rockList + "\n");
        System.out.println("Perfect! Item successfully deleted.\n");


        Thread.sleep(1000);
        Map<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded\n");


        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, or Tooth)\n");
        String fossilChoice = input.nextLine();

        if(fossilChoice.equalsIgnoreCase("bird")){
            System.out.println(fossilChoice + ": " + fossils.get(fossilChoice + " Fossil") + "\n");
        }else if(fossilChoice.equalsIgnoreCase("fish")){
            System.out.println(fossilChoice + ": " + fossils.get(fossilChoice + " Fossil") + "\n");
        }else if(fossilChoice.equalsIgnoreCase("tooth")){
            System.out.println(fossilChoice + ": " + fossils.get(fossilChoice  + " Fossil") + "\n");
        }

        Thread.sleep(700);

        Set<String> specialSupplies = new HashSet<>();

        specialSupplies.add("Compass");
        specialSupplies.add("Flashlight");
        specialSupplies.add("Walky-talky");

        System.out.print("Supplies Before Expedition: ");
        for( String s : specialSupplies){
            System.out.print(s + " ");
        }

        specialSupplies.remove("Compass");
        System.out.print("\nSupplies After Expedition: ");
        for( String s : specialSupplies){
            System.out.print(s + " ");
        }
        input.close();

    }
}
