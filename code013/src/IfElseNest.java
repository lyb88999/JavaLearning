public class IfElseNest {
    public static void main(String[] args) {
        int a = 99;
        int b = 99;
        int c = 1;
        System.out.println("a=" + a + ". b=" + b + ". c=" + c+".");
        if (a == b && b == c) {
            System.out.println("a、b和c一样大");
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a最大");
                } else {
                    if (a == c) {
                        System.out.println("a和c一样大 都是最大值");
                    } else {
                        System.out.println("c最大");
                    }
                }
            } else { // a <= b
                if (b < c) {
                    System.out.println("c最大");
                } else { // b >= c
                    if (b == c) {
                        System.out.println("b和c一样大 都是最大值");
                    } else {
                        if (a == b) {
                            System.out.println("a和b一样大 都是最大值");
                        } else {
                            System.out.println("b最大");
                        }
                    }
                }
            }
        }
    }
}