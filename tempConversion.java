import java.util.Scanner;

public class tempConversion {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to (C/F): ");
        unit = scanner.next().toUpperCase();

        newTemp =(unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;

        System.out.printf("New temperature is %f %s\n", newTemp, unit);



    }
}
