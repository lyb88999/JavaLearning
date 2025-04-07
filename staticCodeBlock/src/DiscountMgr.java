public class DiscountMgr {
    public static void main(String[] args) {
        System.out.println("最终SVIP_DISCOUNT: " + SVIP_DISCOUNT);
    }

    public static double BASE_DISCOUNT;

    public static double VIP_DISCOUNT;

    public static double SVIP_DISCOUNT;

    static {
        BASE_DISCOUNT = 0.99;
        VIP_DISCOUNT = 0.85;
        // SVIP_DISCOUNT = 1/0;

        System.out.println("静态代码块1里面的SVIP_DISCOUNT: " + SVIP_DISCOUNT);
    }

    static {
        SVIP_DISCOUNT = 0.1;
        System.out.println("静态代码块2里面的SVIP_DISCOUNT: " + SVIP_DISCOUNT);
    }
}