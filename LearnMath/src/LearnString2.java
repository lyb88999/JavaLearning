import com.sun.source.tree.ClassTree;

public class LearnString2 {
    public static void main(String[] args) {
        String content = "Orange_Apple_Banana";

        char[] chars = content.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        String[] s = content.split("_");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        int indexOf = content.indexOf('_');
        System.out.println(content.substring(indexOf + 1));

        int lastIndexof = content.lastIndexOf('_');
        System.out.println(content.substring(0, lastIndexof));

        System.out.println(content.contains("Apple"));
        System.out.println(content.contains("apple"));
        System.out.println(content.contains("Orange"));
        System.out.println(content.contains("Banana"));

        String content2 = "Orange_Apple_Banana";
        String content3 = "orange_Apple_Banana";

        System.out.println(content.equals(content2));
        System.out.println(content.equals(content3));
        System.out.println(content.equalsIgnoreCase(content3));

        String str = " abc ";
        System.out.println(str.trim());
    }
}
