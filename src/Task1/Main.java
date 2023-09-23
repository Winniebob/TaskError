package Task1;

import Task1.Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Command command = new Command();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для начала заданий введите 1.");
        int com = scanner.nextInt();
        while (com == 1) {
            command.menu();
            System.out.println("to continue enter 1");
             com = scanner.nextInt();
        }
    }
}