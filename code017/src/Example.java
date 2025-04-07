public class Example {
    public static void main(String[] args) {
        int n = 9;
        String str = n+"对应的中文数字是:";
        switch (n){
            case 1:
                str += "壹";
                break;
            case 2:
                str += "贰";
                break;
            case 3:
                str += "叁";
                break;
            case 4:
                str += "肆";
                break;
            case 5:
                str += "伍";
                break;
            case 6:
                str += "陆";
                break;
            case 7:
                str += "柒";
                break;
            case 8:
                str += "捌";
                break;
            case 9:
                str += "玖";
                break;
            case 10:
                str += "拾";
                break;
            default:
                System.out.println("错误的值");
                return;
        }
        System.out.println(str);
    }
}
