import java.util.Random;
import java.util.Scanner;

public class Jackpot {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int bal = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("************************");
        System.out.println("   Welcome to JAVA Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("************************");

        while (bal > 0) {

            System.out.println("\nCurrent Balance: $" + bal);

            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            if (bet > bal) {
                System.out.println("Insufficient balance.");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0.");
                continue;
            }

            bal -= bet;

            System.out.println("\nSpinning...\n");

            row = spinRow();

            printRow(row);

            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout + "!");
            } else {
                System.out.println("No match.");
            }

            bal += payout;

            if (bal <= 0) {
                System.out.println("\nYou are out of money!");
                break;
            }

            System.out.print("\nPlay again? (yes/no): ");
            scanner.nextLine(); // consume newline
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("\nFinal Balance: $" + bal);
        System.out.println("Thanks for playing!");

        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {

        System.out.println("********************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("********************");
    }

    static int getPayout(String[] row, int bet) {

        // Jackpot
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {

            switch (row[0]) {
                case "🍒":
                    return bet * 3;
                case "🍉":
                    return bet * 4;
                case "🍋":
                    return bet * 5;
                case "🔔":
                    return bet * 10;
                case "⭐":
                    return bet * 20;
            }
        }

        // Two matching symbols
        if (row[0].equals(row[1]) ||
                row[1].equals(row[2]) ||
                row[0].equals(row[2])) {
            return bet * 2;
        }

        return 0;
    }
}
