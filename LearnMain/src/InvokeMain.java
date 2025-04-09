public class InvokeMain {
    public static void main(String[] args) {
        System.out.println("进入了InvokeMain的main方法");
        LearnMain.main(new String[]{"abc", "bcd"});
        System.out.println("退出了InvokeMain的main方法");
    }
}
