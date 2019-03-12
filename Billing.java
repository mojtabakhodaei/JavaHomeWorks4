package HomeWork4;

public class Billing {
    static double computeBill(int price) {
        return price * 1.08;
    }

    static double computeBill(int price, int quantity) {
        return price * quantity * 1.08;
    }

    static double computeBill(int price, int quantity , int coupon) {
        return (price * quantity - coupon)* 1.08;
    }
}
