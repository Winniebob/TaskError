package Task1;

import java.util.Scanner;

public class Command {

    public void menu( ) throws  Exception {
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Float " + " " + "2. /0" + " " + "3. exercise 3 " + " " + "4. getString " + " 5. exit");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Enter a floating point number");
                floatScanner();
                break;
            case 2:
                System.out.println("Enter the divisor");
                separation();
                break;
            case 3:
                System.out.println("the solution of the problem");
                challenge3();
                break;
            case 4:
                System.out.println("enter the string");
                getString();
                break;
            case 5:
                break;
            default:
                break;
        }
    }
    public float floatScanner() throws Exception {
        System.out.println("enter the number");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                float number = scanner.nextFloat();
                System.out.println(number);
                return number;
            } catch (Exception e) {
                System.out.println("it's not number float");
            }
        }
    }

    public double separation() throws Exception {
        double[] intArray;
        intArray = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int d = scanner.nextInt();
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
                return catchedRes1;
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
            } catch (Exception e){
                System.out.println("Not number");
            }
        }
    }

    public void printSum(Integer a, Integer b) throws Exception {
        System.out.println(a + b);
    }

    public void challenge3 () throws Exception{
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public void notNullLine() throws NullLineException{
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.isEmpty() == true) throw new NullLineException("The line must not be empty", text);
        System.out.println(text);
    }

    public  void getString() throws Exception{
        try{
            notNullLine();
        } catch (NullLineException e){
            System.out.println(e.getMessage());
        }
    }

    class NullLineException extends Exception{
        public NullLineException(String message, String text ){
            super(message);
            text.isEmpty();
        }
    }

}
