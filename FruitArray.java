
import java.util.ArrayList;
import java.util.Scanner;

public class FruitArray{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
       fruits.add("Apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("dragon Fruit");
        fruits.add("persimmon");
        fruits.add("fig");
        fruits.add("grape");
        fruits.add("rasberry");
        fruits.add("kiwi");
        fruits.add("lemon");
        
        // should  print all fruits in the ArrayList
        System.out.println("List of Fruits:");
        int index = 0; 
        for (String fruit : fruits) {
            System.out.println(index + ": " + fruit);
            index++; 
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index of the fruit you'd like to see again (0-9): ");
        String userInput = scanner.nextLine();
        
        try {
            Integer userIndex = Integer.valueOf(userInput); 
            int position = userIndex; 
            
            String selectedFruit = fruits.get(position);
            System.out.println("You selected: " + selectedFruit);
        } 
        catch (NumberFormatException e) {
            System.out.println("Exception:  you must enter a number");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: that is out of bounds (0-9)");
        }
        
        scanner.close();
    }
}
}
