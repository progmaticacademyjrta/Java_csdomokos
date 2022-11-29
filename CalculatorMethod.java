import java.util.Scanner;

public class CalculatorMethod {
    
    static String operator = "";
    static int number1 = 0;
    static int number2 = 0;
    
    public static void main(String[] args) {

        getInputFromUser();
        int result = getCalculationResult(operator, number1, number2);
        showResultToUser(result);
    }

    public static void getInputFromUser (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me operator:");
        operator = scanner.nextLine();
        System.out.println("Give me number 1: ");
        number1 = scanner.nextInt();
        System.out.println("Give me number 2: ");
        number2 = scanner.nextInt();
    }

    public static int getCalculationResult (String operator, int number1, int number2){
        int result = 0;
        if(operator.equals("+")){
          result = number1+number2;
        } else if (operator.equals("-")) {
            result = number1-number2;
        } else if (operator.equals("*")) {
            result = number1*number2;
        } else if (operator.equals("/")) {
            result = number1/number2;
        }
        return result;
    }

    public static void showResultToUser(int result){
        System.out.println("Result: " + getCalculationResult(operator,number1,number2));
    }

}
