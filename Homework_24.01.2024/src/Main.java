import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        System.out.println("The number which, the person introduced: " + number);
        double resultOfSqrt = sqrt(number);
        System.out.println("the square of the number: " + resultOfSqrt);
       //System.out.println("the square of the number: " + sqrt(number));

        double dnumber1 = scanner.nextDouble();
        double dnumber2 = scanner.nextDouble();

        double resultOfAmount = amount(dnumber1, dnumber2);
        System.out.println(resultOfAmount);

        double resultOfMultiply = multiply(dnumber1, dnumber2);
        System.out.println(resultOfMultiply);

        double resultOfDivision = division(dnumber1, dnumber2);
        System.out.println(resultOfDivision);

        double dnumber3 = scanner.nextDouble();
        double dnumber4 = scanner.nextDouble();
        double resultOfDivisionwithmod = divwithmod(dnumber3, dnumber4);
        System.out.println(resultOfDivisionwithmod);

    }
public static double sqrt(Double number) {
        double sqrtResult = number * number;
        return sqrtResult;
}
public static double amount(Double number1, Double number2){
        double amountResult = number1 + number2;
        return amountResult;
}
public static double multiply(Double number1, Double number2){
        double multiplyResult = number1 * number2;
        return multiplyResult;

}
public static double division(Double number1, Double number2){
        double divisionResult = number1 / number2;
                return divisionResult;
}
public static double divwithmod(Double number3, Double number4){
        double divwithmodResult = number3 % number4;
        return divwithmodResult;

}

}