package HomeWork4;

public class FormLetterWriter {
    void displaySalutation(String lastName) {
        System.out.println("salutation Dear mr. or Ms. " + lastName);
    }

    void displaySalutation(String firstName, String lastName) {
        System.out.println("greeting Dear " + firstName + ' ' + lastName);
    }
}
