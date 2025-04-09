public class LearnString {
    public static void main(String[] args) {
        String content = "01234567ABCDefgh";

        System.out.println(content.length());

        System.out.println(content.toUpperCase());
        System.out.println(content.toLowerCase());

        System.out.println(content);

        System.out.println(content.charAt(1));

        System.out.println(content.substring(5)); // 5到最后
        System.out.println(content.substring(1, 5)); // 前闭后开

    }
}
