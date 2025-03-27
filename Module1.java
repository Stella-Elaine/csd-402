import java.util.Scanner;

public class Module1 
{  
public static void main(String [] args ){

    Scanner scanner = new Scanner(System.in);

    System.out.print("type the amount if water in kilograms please:");
    double waterMass = scanner.nextDouble();



    System.out.print("type the initial tempt in Celsius please:");
    double initialTemperature = scanner.nextDouble();


    System.out.print("type the final temp in Celsius please:");
    double finalTemperature = scanner.nextDouble();

    double energy = waterMass *(finalTemperature-initialTemperature)* 4184;
    System.out.print("the energy needed to heat water is " + energy + "Joules");

    scanner.close(); }
}


// The formula to use for this program is:
// Q = waterMass ( finalTemperature – initialTemperature ) x 4184
// waterMass is water weight in kilograms
// finalTemperature and initialTemperature are temperatures in Celsius
// Q is the results in Joules