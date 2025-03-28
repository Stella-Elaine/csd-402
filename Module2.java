import java.util.Scanner;
import java.util.Random;

public class Module2 {

public static void main(String [] args ){
    Scanner scanner =new Scanner(System.in);
    Random random = new Random();


    // int randomNum = (int)(Math.random() * 3);
    int computerChoice = random.nextInt(3) +1;

    System.out.print( "Welcome to the game Rock Paper Scissors");
    System.out.print( " enter your choice for the round");
    System.out.print( "rock");
    System.out.print( "paper");
    System.out.print( "scissors");

    int userChoice = scanner.nextInt();
    // int computerChoice = random.nextInt();

System.out.println("\n the Computer's choice: " + (computerChoice));
System.out.println("Your choice: " + (userChoice));

String result = theWinner(computerChoice, userChoice);

System.out.println(result);

scanner.close();
}
public static String choiceToString(int choice) {
switch (choice) {
    case 1: return "Rock";

    case 2: return "Paper";

    case 3: return "Scissors";

    default: return "Invalid Choice";
}
}

public static String theWinner(int computerChoice, int userChoice) {
if (computerChoice == userChoice) {
    return "It's a tie!";
} else if ((computerChoice == 1 && userChoice == 3) || 
           (computerChoice == 2 && userChoice == 1) || 
           (computerChoice == 3 && userChoice == 2)) {
    return " the computer wins!";
} else {
    return "you win!";
}
}
}


    


// Module2- Follow the directions below:
// The program should randomly generate the number of 1, 2, or 3 with 1 being Rock, 2 being Paper,and 3 being Scissors. This will be the computer’s selection in the game. Then, 
// the program should prompt the user to enter a value of 1, 2, or 3. This will be the user’s selection in the game. 
// Next, the program should display a clear readable message displaying both the computer’s selection,the user’s selection, and the results of the game played.