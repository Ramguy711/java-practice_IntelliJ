import java.util.Random;
import java.util.Scanner;

public class slotmachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] rows;

        System.out.println("********************************");
        System.out.println("Welcome to Slot Machine");
        System.out.println("Symbols: 🐵 🐶 🐭 🐄 🐃");
        System.out.println("********************************");

        while (balance > 0) {

            System.out.println("\nCurrent balance: " + balance);
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();

            // Validation
            if (bet > balance) {
                System.out.println("Insufficient balance");
                continue;
            }
            if (bet <= 0) {
                System.out.println(" Bet must be greater than 0");
                continue;
            }

            balance -= bet;

            rows = spin();
            spinning(rows);

            payout = betts(rows, bet);
            balance += payout;

            System.out.println("\nYou won: " + payout);

            if (balance == 0) {
                System.out.println("You are out of money!");
            }
        }

        sc.close();
    }

    // Spin symbols
    static String[] spin() {
        String[] symbols = {"🐵", "🐶", "🐭", "🐄", "🐃"};
        String[] rows = new String[3];
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            rows[i] = symbols[rand.nextInt(symbols.length)];
        }

        return rows;
    }

    // Display result
    static void spinning(String[] row) {
        System.out.println("\n" + row[0] + " | " + row[1] + " | " + row[2]);
    }

    // Calculate payout
    static int betts(String[] row, int bet) {

        // All 3 match
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🐵" -> bet * 5;
                case "🐶" -> bet * 4;
                case "🐭" -> bet * 3;
                case "🐄" -> bet * 2;
                case "🐃" -> bet;
                default -> 0;
            };
        }

        // First 2 match
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🐵" -> bet * 3;
                case "🐶" -> bet * 2;
                case "🐭" -> bet * 2;
                case "🐄" -> bet;
                case "🐃" -> bet;
                default -> 0;
            };
        }

        // Last 2 match
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🐵" -> bet * 3;
                case "🐶" -> bet * 2;
                case "🐭" -> bet;
                case "🐄" -> bet;
                case "🐃" -> bet;
                default -> 0;
            };
        }

        // No match
        return 0;
    }
}