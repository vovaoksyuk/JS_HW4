import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        System.out.println("Введите число a =");
        int a = sx.nextInt();
        System.out.println("Введите число b =");
        int b = sx.nextInt();
        System.out.println("Введите знак операции");
        String simvol = sx.next();
        int opr1 = a + b, opr2 = a - b, opr3 = a * b, opr4 = a / b, opr5 = a % b;
        switch (simvol) {
            case "+": {
                System.out.println("a*b=" + opr1);
                break;

            }

            case "-": {
                System.out.println("a-b=" + opr2);
                break;
            }
            case "*": {
                System.out.println("a*b=" + opr3);
                break;
            }
            case "/": {
                System.out.println("a/b=" + opr4);
                break;
            }
            case "%": {
                System.out.println("a%b=" + opr5);
                break;
            }
            default: {
                System.out.println("Введите еще раз");
            }
        }
    }}