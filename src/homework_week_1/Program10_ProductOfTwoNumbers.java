package homework_week_1;

/**
 * 10. Write a java program that takes two numbers as input and dispaly the
 * product of two numbers.
 * Test Data:
 * Input First number: 25
 * Input Second number: 5
 * Expected Output: 25 x 5 =125
 */
public class Program10_ProductOfTwoNumbers {
    public static void main(String[] args) {
        //First Number declaration
        int firstNumber = 25;
        //Second Number declaration
        int secondNumber = 5;
        int produced = firstNumber * secondNumber;
        //Expected Output
        System.out.println(firstNumber + " x "+secondNumber + " = "+produced);

    }
}
