package utils;

import java.util.Scanner;

public class Inputs {
    private static Scanner scanner = new Scanner(System.in);
    public static String input(String info) {
        System.out.print(info + " : ");
        return scanner.nextLine();
    }
}
