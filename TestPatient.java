package HomeWork4;

public class TestPatient {
    public static void main(String[] args) {
        System.out.println("Patient 1 :");
        Patient p1 = new Patient();
        System.out.println("ID: " + p1.getIdNumbrer() + "\nAge: " + p1.getAge());
        System.out.println("BloodType: " + p1.getBloodData().getBloodtype() + ((p1.getBloodData().getRHFactor()) ? "+" : "-") + "\n=====================");

        System.out.println("Patient 2 :");
        Patient p2 = new Patient(12 , 24 , new BloodData("A" , false));
        System.out.println("ID: " + p2.getIdNumbrer() + "\nAge: " + p2.getAge());
        System.out.println("BloodType: " + p2.getBloodData().getBloodtype() + ((p2.getBloodData().getRHFactor()) ? "+" : "-"));

    }
}
