import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        String zn = in.next();
        int num2 = in.nextInt();
        if("+".equals(zn)){
            num1 = num1 + num2;
            System.out.println(num1);
        }
        else if("-".equals(zn)){
            num1 = num1 - num2;
            System.out.println(num1);
        }
        else if("*".equals(zn)){
            num1 = num1 * num2;
            System.out.println(num1);
        }
        else if("/".equals(zn)) {
            if (num2 != 0) {
                num1 = num1 / num2;
                System.out.println(num1);
            } else {
                System.out.println("Деление на 0");
            }
        }
    }
}