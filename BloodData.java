package HomeWork4;

public class BloodData {
    String Bloodtype;
    Boolean RHFactor;

    public BloodData() {
        this.Bloodtype = "O";
        this.RHFactor = true;
    }

    public BloodData(String Bloodtype , Boolean RHFactor){
        this.Bloodtype=Bloodtype;
        this.RHFactor=RHFactor;
    }

    public void setBloodtype(String bloodtype) {
        Bloodtype = bloodtype;
    }

    public String getBloodtype() {
        return Bloodtype;
    }

    public void setRHFactor(Boolean RHFactor) {
        this.RHFactor = RHFactor;
    }

    public Boolean getRHFactor() {
        return RHFactor;
    }
}
