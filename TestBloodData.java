package HomeWork4;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData Blood1= new BloodData();
        System.out.println(Blood1.Bloodtype + ((Blood1.RHFactor)?  "+" : "-") );
        BloodData Blood2= new BloodData("AB" ,true);
        System.out.println(Blood2.Bloodtype + ((Blood2.RHFactor)?  "+" : "-") );

    }
}
