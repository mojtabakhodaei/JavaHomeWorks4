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

        encryptAll(str,number);
    }

    static char encrypt(char charactor, int codeNumber) {
        return (char) ((int) charactor + codeNumber);
    }

    static String encryptAll(String str, int number) {
        String str2=str;
        char selectChar;
        for (int i = 0; i < str.length(); i++) {
            selectChar=str.charAt(i);
            str2 = str.replace(selectChar, encrypt(selectChar, number));
        }
        return str2;
    }
}
