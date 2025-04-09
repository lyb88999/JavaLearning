import java.util.Random;

public class LearnMath {
    public static void main(String[] args) {
        System.out.println(Math.random());

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt());
        }

        System.out.println(Math.abs(-9.3));
        System.out.println(Math.abs(-100));

        System.out.println(Math.round(-8.2));
        System.out.println(Math.round(-8.5)); // -8
        System.out.println(Math.round(-8.51));

        System.out.println(Math.round(9.2));
        System.out.println(Math.round(9.5));
        System.out.println(Math.round(9.8));
    }
}