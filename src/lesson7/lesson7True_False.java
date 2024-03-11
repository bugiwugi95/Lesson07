package lesson7;

import java.util.Scanner;

public class lesson7True_False {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        char operand1 = exp.charAt(0);
        char op = exp.charAt(1);
        char operand2 = exp.charAt(2);
        boolean value1;
        if (operand1 == '1') {
            value1 = true;
        } else {
            value1 = false;
        }
        boolean value2;
        if (operand2 == '1') {
            value2 = true;
        } else {
            value2 = false;
        }

        if (op == '&') {
            System.out.println(value1 && value2);

        } else if (op == '|') {
            System.out.println(value1 || value2);
        } else {
            System.out.println("unknown operator");
        }

    }
}
