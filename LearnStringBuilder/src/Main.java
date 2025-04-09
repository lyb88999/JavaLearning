public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        long longVar = 123456789;
        stringBuilder.append(true).append("abc").append(longVar);

        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse().toString());
        System.out.println(stringBuilder.reverse().toString());

        System.out.println(stringBuilder.delete(0, 4).toString()); // 左闭右开

        System.out.println(stringBuilder.insert(3,"LLLL").toString());
    }
}