package programme_1_calculate;

/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main {

    //Write a main method
    public static void main(String[] args) {
        //scanner declaration for reading  input from the console
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true){
            System.out.println("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            System.out.println("Please enter one of symbol +,-,/,*: ");
            char symbol = scanner.next().charAt(0);

            calculator.calculateResult(firstNumber, secondNumber, symbol);

            System.out.println("Would you like to do more calculation? enter Y or N");
            char choice = scanner.next().charAt(0);

            if(choice == 'N' || choice == 'n'){
                System.out.println("Program terminated ");
                break;
            }
        }
        //scanner close
        scanner.close();
    }
}
