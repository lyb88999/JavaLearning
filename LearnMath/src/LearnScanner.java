import java.math.BigInteger;
import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个巨大的数");
        BigInteger bigInteger = scanner.nextBigInteger();
        System.out.println("你想给这个数加多少");
        BigInteger toBeAdd = scanner.nextBigInteger();
        System.out.println(bigInteger.add(toBeAdd));

    }
}
