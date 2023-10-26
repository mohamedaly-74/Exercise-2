import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //amount of lego bricks
        int legoBricks;

        //capacity of the container
        int containerCapacity;

        while (true) {
            System.out.print("Enter the number of Lego bricks (between 50 and 100, odd number): ");
            legoBricks = scanner.nextInt();

            // Ask the user to enter the number of Lego bricks (odd number between 50 and 100) and if he put even number the program will ask him again for odd number
            if (legoBricks >= 50 && legoBricks <= 100 && legoBricks % 2 != 0) {
                break; // Exit the loop if the input is valid
            } else {
                System.out.println("Invalid input. Please enter an odd number between 50 and 100.");
            }
        }

        while (true) {
            System.out.print("Enter the container capacity (between 5 and 10, even number): ");
            containerCapacity = scanner.nextInt();

            // Ask the user to enter the container capacity (even number between 5 and 10) if he put even number the program will ask him again for odd number
            if (containerCapacity >= 5 && containerCapacity <= 10 && containerCapacity % 2 == 0) {
                break; // Exit the loop if the input is valid
            } else {
                System.out.println("Invalid input. Please enter an even number between 5 and 10.");
            }
        }

        // How many full containers the user has
        int fullContainers = legoBricks / containerCapacity;

        // How many blocks are in the container that is not completely full
        int remainingBlocks = legoBricks % containerCapacity;

        // How many containers are not full
        int containersNotFull = (remainingBlocks == 0) ? fullContainers : fullContainers + 1;

        // Total number of containers
        int totalContainers = fullContainers + containersNotFull;

        System.out.println();
        System.out.println("Results:");
        System.out.println("--------");

        // Output
        System.out.println("Number of Lego bricks: " + legoBricks);
        System.out.println("Container capacity: " + containerCapacity);
        System.out.println("Number of full containers: " + fullContainers);
        System.out.println("Number of containers not full: " + containersNotFull);
        System.out.println("Total number of containers: " + totalContainers);
        System.out.println("Number of blocks in not full container: " + remainingBlocks);

        scanner.close();
    }
}