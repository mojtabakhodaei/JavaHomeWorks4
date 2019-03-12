package HomeWork4;

public class TestPatient {
    public static void main(String[] args) {
        Patient p1=new Patient();
        System.out.println("ID: " + p1.getIdNumbrer() + "\nAge: " + p1.getAge() );
        System.out.println("BloodType: " + p1.getBloodData().getBloodtype() +  ((p1.getBloodData().getRHFactor())?  "+" : "-"));
    }
}
