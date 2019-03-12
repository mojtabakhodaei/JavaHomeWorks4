package HomeWork4;

public class FormLetterWriter {
    static void displaySalutation(String lastName) {
        System.out.println("salutation Dear mr. or Ms. " + lastName + "Thank you for your recent order");
    }

    static void displaySalutation(String firstName, String lastName) {
        System.out.println("greeting Dear " + firstName + ' ' + lastName + "Thank you for your recent order");
    }

    public static void main(String[] args) {
        displaySalutation("khodaei");
        displaySalutation("mojtaba" , "khodaei");
    }
}
