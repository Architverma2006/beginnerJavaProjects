import java.util.Scanner;

public class compondInterest{
    public static void main(String[] args){
        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal = 0;
        double rate = 0;
        double timesCompounded = 0;
        int years;
        double amount = 0;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the no of times to compound: ");
        timesCompounded = scanner.nextDouble();
        System.out.print("Enter the years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+ rate/timesCompounded, timesCompounded*years);

        System.out.printf("The amount after %d years is %.2f", years,amount);


        scanner.close();

    }
}
