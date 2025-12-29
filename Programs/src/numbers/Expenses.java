package numbers;

/* Let expense = [apple,banana,orange]

Let prices = {apple : 1, orange : 2, banana : 3,grapes : 4}

values in percentage
Let discount = {apple:10,banana:5}
Let tax = 8;

You have to find final price including tax
Tax should be applied after discounts

*/

import java.util.*;

public class Expenses {

    private static void calculateDiscount(List<String> basket, Map<String, Integer> items, Map<String, Integer> discounts, int tax) {
        double finalDiscountPrice = 0;

        for (String fruit: basket) {
            if (items.containsKey(fruit)) {
                int price = items.get(fruit);
                double discountPercentage = discounts.getOrDefault(fruit, 0);
                finalDiscountPrice += price - (price * discountPercentage / 100.0);
            }
        }
        calculateTax(tax, finalDiscountPrice);
    }

    private static void calculateTax(int tax, double discountedPrice) {
        double finalPrice = discountedPrice + (discountedPrice * tax / 100.0);
        System.out.println("The final price is: " + finalPrice);
    }

    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 1);
        items.put("Orange", 2);
        items.put("Banana", 3);
        items.put("Grapes", 4);

        Map<String, Integer> discounts = new HashMap<>();
        discounts.put("Apple", 10);
        discounts.put("Banana", 5);

        int tax = 8;
        List<String> basket = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three items in your basket");
        for (int i = 1; i <= 3; i++) {
            String input = scanner.nextLine();
            if (input != null && items.containsKey(input)) {
                String format = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
                basket.add(format);
            }
        }
        calculateDiscount(basket, items, discounts, tax);
    }
}
