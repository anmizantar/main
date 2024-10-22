import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("input: ");
            String input = scan.nextLine();
            System.out.println(calc(input));
        } while (true);
    }
    public static String calc(String input) throws Exception {
        int num1;
        int num2;
        String operator;
        String result;
        input = input.replaceAll(" ","");
        String[] operands = input.split("[+\\-*/]");
        if(operands.length != 2){
            throw new Exception();}
        operator = detectOperator(input);
        num1 = Integer.parseInt(operands[0]);
        num2 = Integer.parseInt(operands[1]);
        if(num1 < 0 || num1 > 10){
            throw new Exception();
        }
        if(num2 < 0 || num2 > 10){
            throw new Exception();
        }
        int equals = action(num1, num2, operator);
        result = String.valueOf(equals);
        return result;

    }
    static String detectOperator(String input){
        if(input.contains("+")) return "+";
        else if (input.contains("-")) return "-";
        else if (input.contains("*")) return "*";
        else if (input.contains("/")) return "/";
        else return null;
    }
    static int action(int a, int b, String oper){
        if(oper.equals("+")) return a + b;
        else if(oper.equals("-")) return a - b;
        else if(oper.equals("*")) return a * b;
        else return a / b;
    }
}

