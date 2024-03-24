package day2;

import java.util.Scanner;

class Calculator {

    
     String cmdline;

    public Calculator() {

    }

    public Calculator(String s) {
        cmdline = s;
    }

    public String getcmdline() {
        return cmdline;
    }

    public void setcmdline(String cmdline) {
        this.cmdline = cmdline;
    }

    public static String doOperation(String cmdline) {
        String[] parts = cmdline.split(" ");
        double operator1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double operand2 = Double.parseDouble(parts[2]);
        double result = 0.0;

        switch (operator) {
            case "+":
                result = operator1 + operand2;
                break;
            case "-":
                result = operator1 - operand2;
                break;
            case "*":
                result = operator1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operator1 / operand2;
                } else {
                    System.out.println("Error: Division by zero");

                }
                break;
            default:
                return "Invalid operator. Supported operators: +, -, *, /";

        }

        return "The result is: " + result;
    }
}

public class BasicCalculator {

    public static void main(String[] args) {

//        String commandline = "70 + 30";
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your input (e.g., 70 + 30 or 70 + 30 * 5):");
        String commandline = scanner.nextLine();

        Calculator cal = new Calculator(commandline);

        System.out.println( cal.doOperation(commandline));

    }

}
