package OverallOperation;
// 强制转换
public class Coercion {
    public static void main(String[] args) {
        int i1 = 1234567;
        short s1 = (short) i1;  // -10617
        System.out.println("i1(1234567)由 int 转换为 short 类型：" + s1);
        int i2 = 12345678;
        short s2 = (short) i2;  //24910
        System.out.println("i2(12345678)由 int 转换为 short 类型：" + s2);
    }
}
