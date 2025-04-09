public class Main {
    public static void main(String[] args) {
        Merchandise m = new Phone("Samsung S23 Ultra", "SM-S23U", 10000, 100, "Samsung", "S23 Ultra", 128);
        if(m instanceof Phone){
            Phone p = (Phone) m;
            System.out.println(p.getBrand());
        }

        Merchandise.staticMethod();
        Phone.staticMethod();
        ShellColorChangePhone.staticMethod();
    }
}