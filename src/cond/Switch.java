package cond;

public class Switch {
    public static void main(String[] args) {
        int grade=3;
        int coupon;

        switch (grade){
            case 1:
                coupon=1000;
                break;
            case 2:
                coupon=2000;
                break;
            default:
                coupon=500;
        }


        System.out.println(coupon);

        coupon= switch(grade){
            case 1->1000;
            case 2 -> 2000;
            default -> 500;
        };
        System.out.println(coupon);


    }
}
