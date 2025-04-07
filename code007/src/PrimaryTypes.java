public class PrimaryTypes {
    public static void main(String[] args) {
        byte byteVar = 99;
        System.out.println(byteVar);

        short shortVar = -30000;
        System.out.println(shortVar);

        int intVar = 300000;
        System.out.println(intVar);

        long longVar = 99;
        long bigLongVar = 9999999999L;
        System.out.println(longVar);
        System.out.println(bigLongVar);

        float floatVar = 100.1111111f;
        System.out.println(floatVar);
        double doubleVar = 100.1111111;
        System.out.println(doubleVar);

        boolean condition = true;
        boolean fcondition = false;
        System.out.println(condition);
        System.out.println(fcondition);

        char ch = 'A';
        System.out.println(ch);

        int a = 05;
        int b = 011;
        int c = 0xF;
        int d = 0x11;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        a = 0xF8;
        b = 0xF4;
        c = 0xFF;
        System.out.println(a&b); // 0xF0 240
        System.out.println(a|b); // 0xFC 252
        System.out.println(a^b); // 0x0C 12
        System.out.println(~c); // -256

        a = 0x400;
        System.out.println(a);
        System.out.println(a>>1); // 0x200 512
        System.out.println(a>>2); // 0x100 256

        b = -0x400;
        System.out.println(b);
        System.out.println(b>>1); // -0x200 -512
        System.out.println(b>>2); // -0x100 -256

        System.out.println(b<<1);
        System.out.println(b<<2);

        System.out.println(b>>>1);
        System.out.println(b>>>2);

        char zang = '\u81e7';
        System.out.println(zang);

        int String = 999;
        System.out.println(String);
    }
}
