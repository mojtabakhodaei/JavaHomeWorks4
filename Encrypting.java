package HomeWork4;

import java.util.Scanner;

public class Encrypting {

    public static void main(String[] args) {
        String str;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your sentences : ");
        str = scanner.nextLine();
        System.out.println("Write your number for encrypt: ");
        number = scanner.nextInt();
    }
    public char encrypt(char charactor, int codeNumber) {
        return (char)((int) charactor+ codeNumber);
    }
}
