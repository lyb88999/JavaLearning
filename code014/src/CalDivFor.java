public class CalDivFor {
    public static void main(String[] args) {
        int divided = 100;
        int divisor = 3;
        int cnt = 0;
        for (int i = 0; i < 100 && cnt < 10; i++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + ", 商是" + divided / divisor);
                cnt++;
            }
            divided++;
        }

    }
}
