import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        String trash;

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); //Clear the buffer

            if (itemPrice >= 100) {
                shippingCost = 0; // Free shippping for $100 or more
            } else {
                shippingCost = itemPrice * 0.02; // 2% shippig cost for items under $
            }

            double totalPrice = itemPrice + shippingCost;

            System.out.println("\nItem Price: $" + itemPrice);
            System.out.println("shipping Cost: $" + shippingCost);
            System.out.println("Total Price: $" + totalPrice);
        }else {
            trash = in.nextLine(); // Read the invalid input as a string
            System.out.println("\nInvalid input: " + trash);
            System.out.println("Run the program again and enter a valid price");
        }

            }


        }

