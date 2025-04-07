import java.util.Scanner;

public class ReadStringFromConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请问你的名字是?");
        String name = in.nextLine();
        System.out.println(name + ", 你好");
        System.out.println("请问您几岁了?");
        int age = in.nextInt();
        System.out.println("好的, " + name + age + "岁了");
    }
}
