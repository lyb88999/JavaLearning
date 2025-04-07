import java.util.Random;

public class LearnMath {
    public static void main(String[] args) {
        System.out.println(Math.random());

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextDouble());
        }
    }
}