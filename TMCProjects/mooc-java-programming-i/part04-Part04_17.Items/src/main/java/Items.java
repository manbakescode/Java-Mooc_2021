
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String itemName = scanner.nextLine();
            if (itemName.isEmpty()) {
                break;
            }
            items.add(new Item(itemName));
        }

        for (Item item: items) {
            System.out.println(item);
        }

    }
}
