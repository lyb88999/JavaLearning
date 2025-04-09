import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
//        Object o = new Object();
//        printObj(o);
//        printObj(100);
//        printObj("Hello world");

        Phone p = new Phone("Samsung S23 Ultra", "SM-S23U", 10000, 100, "Samsung", "S23 Ultra", 128);

        Class clazz = p.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        Field brandField = clazz.getField("publicInfo");
        System.out.println(brandField.getName());
        System.out.println(brandField.getType());

        Method equalsMethod = clazz.getMethod("equals", Object.class);
        System.out.println(equalsMethod.getName());
        System.out.println(equalsMethod.getReturnType());

        Method getModelMethod = clazz.getMethod("getModel");
        System.out.println(getModelMethod.getName());
        System.out.println(getModelMethod.getReturnType());

    }

    private static void printObj(Object obj) {
        System.out.println("--------" + "obj的详细内容" + "--------");
        System.out.println(obj);

        System.out.println(obj.toString());

        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());

        String s1 = "aaabbb";
        String s2 = "aaa" + "bbb";
        System.out.println("s1 == s2? " + (s1 == s2));

        System.out.println("s1 equals s2?" + (s1.equals(s2)));

        System.out.println("请输入s1:");
        s1 = new Scanner(System.in).next();
        System.out.println("请输入s2:");
        s2 = new Scanner(System.in).next();
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 equals s2?" + (s1.equals(s2)));
    }
}