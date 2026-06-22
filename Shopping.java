import java.util.Scanner;

public class Shopping {
    public static void main(String[] args){

        // Shopping cart

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the Item: ");
        String item = scanner.nextLine();

        System.out.print("Enter the price of the Item: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the Quantity of the item: ");
        int quantity = scanner.nextInt();

        double amount = price * quantity;

        System.out.println("Item: " + item);
        System.out.println("Price: " + price + "$");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + amount + "$");


        scanner.close();

    }
}
