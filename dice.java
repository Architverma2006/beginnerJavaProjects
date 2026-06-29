import java.util.Scanner;
import java.util.Random;
public class dice {
    public static void main(String[] args){
        //Dice Roller Program in JAVA
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare Variables
        int numOfDice;
        int total = 0;

        System.out.print("Enter the number of dice to be rolled: ");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0){

            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled " + roll);
                total += roll;
            }
            System.out.println("Total " + total);

        }
        else{
            System.out.println("No must be greater then  0");
        }
        

        scanner.close();
    }
    static void printDie(int roll){

        String die1 = """
                ---------
                |       |
                |   ●   |
                |       |
                ---------
                
                """;

        String die2 = """
                ---------
                | ●     |
                |       |
                |     ● |
                ---------
                
                """;

        String die3 = """
                ---------
                | ●     |
                |   ●   |
                |     ● |
                ---------
                
                """;

        String die4 = """
                ---------
                | ●    ●|
                |       |
                | ●    ●|
                ---------
                
                """;

        String die5 = """
                ---------
                | ●    ●|
                |   ●   |
                | ●    ●|
                ---------
                
                """;

        String die6 = """
                ---------
                | ●    ●|
                | ●    ●|
                | ●    ●|
                ---------
                
                """;

        switch(roll){
            case 1 -> System.out.print(die1);
            case 2 -> System.out.print(die2);
            case 3 -> System.out.print(die3);
            case 4 -> System.out.print(die4);
            case 5 -> System.out.print(die5);
            case 6 -> System.out.print(die6);
            default -> System.out.println("Invalid roll");

        }

    }
}
