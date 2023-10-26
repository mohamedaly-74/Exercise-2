import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        double earthGravityMohamed = 9.81;
        double marsGravityMohamed = 0.38 * earthGravityMohamed;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight on Earth in Kg: ");
        
        double earthWeightMohamed = scanner.nextDouble();
        double marsWeightMohamed = earthWeightMohamed * marsGravityMohamed / earthGravityMohamed;

        System.out.printf("Your Weight on Mars is %.4f Kg.%n",marsWeightMohamed);

        int roundedmarsWeightMohamed = (int) marsWeightMohamed;
        System.out.println("Rounded Mars Weight on Mars (as integer) is " + roundedmarsWeightMohamed);

        char charFromInt = (char) roundedmarsWeightMohamed;
        System.out.println("Corresponding character is " + charFromInt);

        int intType = charFromInt + 10;
        System.out.println("Result of the math operation on the char is " + intType);

        scanner.close();
    }
}
