package HomeWork4;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData Blood1= new BloodData();
        System.out.println(Blood1.getBloodtype() + ((Blood1.getRHFactor())?  "+" : "-") );
        BloodData Blood2= new BloodData("AB" ,true);
        System.out.println(Blood2.getBloodtype() + ((Blood2.getRHFactor())?  "+" : "-") );

    }
}
