import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){

        // Calculator Programme using switches
        
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        Boolean validOperator = true;

        System.out.print("Enter a number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+,-,*,/,^) : ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter a second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = (num1 + num2);
            case '-' -> result = (num1 - num2);
            case '*' -> result = (num1 * num2);
            case '/' ->{
                if(num2 == 0){
                    System.out.println("0 can't be divided");
                    validOperator = false;
                }
                else{
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default ->{
                System.out.println(operator + " Not a valid operator");
                validOperator = false;
            }
        }

        if(validOperator){
            System.out.println(result);
        }
        scanner.close();
    }
}
