package BasicDataTypes;

public class Integer {
    public static void main(String[] args) {
        int i = 22222;
        int i2 = -213142;
        int i3 = 2_000_000_000; // Java 中，数字可以用下划线连接，便于识别
        int i4 = 0xff0000;      // 十六进制表示的 16711680
        int i5 = 0b1000000000;  // 二进制表示的 512
        long l1 = 9000000000000000000L; // long型的结尾需要加L。输出时，并不会显示代码结尾的 L
        System.out.println("long 型 l1 的值为： " + l1);
    }
}
