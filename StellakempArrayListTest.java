import java.util.ArrayList;
import java.util.Scanner;

public class StellaKempArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = list.get(0);

        for (Integer number : list) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 0 to stop):");

        int input = -1;

        while (input != 0) {
            input = scanner.nextInt();
            numbers.add(input);        
        }

        Integer largest = max(numbers); 

        System.out.println("The largest number is: " + largest);
    }
}
