import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    String stockName;
    int quantity;
    double price;

    Stock(String stockName, int quantity, double price) {
        this.stockName = stockName;
        this.quantity = quantity;
        this.price = price;
    }

    double getTotalValue() {
        return quantity * price;
    }
}

public class StockTradingPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Stock> portfolio = new ArrayList<>();

        while (true) {
            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Stock Name: ");
                    String name = sc.next();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price per Share: ");
                    double price = sc.nextDouble();

                    portfolio.add(new Stock(name, qty, price));

                    System.out.println("Stock Purchased Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Stock Name to Sell: ");
                    String sellName = sc.next();

                    boolean found = false;

                    for (int i = 0; i < portfolio.size(); i++) {
                        if (portfolio.get(i).stockName.equalsIgnoreCase(sellName)) {
                            portfolio.remove(i);
                            found = true;
                            System.out.println("Stock Sold Successfully!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Stock Not Found!");
                    }
                    break;

                case 3:
                    double totalPortfolioValue = 0;

                    System.out.println("\n--- Portfolio Details ---");

                    if (portfolio.isEmpty()) {
                        System.out.println("No Stocks Available.");
                    } else {
                        for (Stock s : portfolio) {
                            System.out.println("Stock: " + s.stockName);
                            System.out.println("Quantity: " + s.quantity);
                            System.out.println("Price: " + s.price);
                            System.out.println("Value: " + s.getTotalValue());
                            System.out.println("-----------------------");

                            totalPortfolioValue += s.getTotalValue();
                        }

                        System.out.println("Total Portfolio Value: " + totalPortfolioValue);
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
