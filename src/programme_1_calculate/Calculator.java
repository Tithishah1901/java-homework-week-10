package programme_1_calculate;

/**
 * Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 */

public class Calculator {
    //addition method
    public void addition(int a,int b){
        System.out.println("Addition: " + (a + b));
    }
    //subtraction method
    public void subtraction(int a, int b){
        System.out.println("Subtraction: " + (a - b));
    }
    //division method
    public void division(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
    //multiplication method
    public void multiplication(int a, int b){
        System.out.println("Multiplication: " + (a * b));
    }
    //calculate result method
    public void calculateResult(int a, int b,char symbol){
        switch (symbol){
            case '+':
                addition(a,b);
                break;
            case '-':
                subtraction(a,b);
                break;
            case '/':
                division(a,b);
                break;
            case '*':
                multiplication(a,b);
                break;
            default:
                System.out.println("Invalid operation symbol");
                break;
        }

    }
}
