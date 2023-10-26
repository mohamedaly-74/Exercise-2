import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        // Create Random Object

        int randomNumberMohamed = random.nextInt(100) + 1;
        // Generating random number between 1 and 100

        System.out.println("Random number generator");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Generated random number: " + randomNumberMohamed);
        // Display the generated random number

        if (randomNumberMohamed % 2 == 0) //if the number is dividable by 2 it is even
        {
            System.out.println("The random number is even.");
        } else // if the number is not dividable by 2 it is odd
        {
            System.out.println("The random number is odd.");
        }
        // Now It automatically checks if the number is even or odd

        System.out.println("");
        System.out.println("Thank you for using my application.");
    }

}
