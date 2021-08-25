
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();


        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        System.out.println("Enter numbers: ");
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                statisticsEven.addNumber(number);
            }
            if (number % 2 != 0) {
                statisticsOdd.addNumber(number);
            }
            statistics.addNumber(number);
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum if even numbers: " + statisticsEven.sum());
        System.out.println("Sum if odd numbers: " + statisticsOdd.sum());


    }
}
