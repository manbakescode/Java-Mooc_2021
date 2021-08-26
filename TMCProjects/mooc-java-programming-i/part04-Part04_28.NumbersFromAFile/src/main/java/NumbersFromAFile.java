
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();


        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNext()) {
                numbers.add(Integer.valueOf(fileReader.nextLine()));
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);

    }

}
