package OverallOperation;
// 位运算
public class BitOperation {
    public static void main(String[] args) {
        System.out.println("——与运算——");
        int n = 0 & 0;
        System.out.println(n);
        n = 0 & 1;
        System.out.println(n);
        n = 1 & 0;
        System.out.println(n);
        n = 1 & 1;
        System.out.println(n);
        System.out.println("——或运算——");
        int m = 0 | 0;
        System.out.println(m);
        m = 0 | 1;
        System.out.println(m);
        m = 1 | 0;
        System.out.println(m);
        m = 1 | 1;
        System.out.println(m);
        System.out.println("——非运算——");
//        long v = ~0;
//        System.out.println(v);
//        v = ~1;
//        System.out.println(v);
        /*
            此举例不当，非运算是用的二进制。
         */
        System.out.println("此举例不当，非运算是用的二进制。");
        System.out.println("——异或运算——");
        int b = 0 ^ 0;
        System.out.println(b);
        b = 0 ^ 1;
        System.out.println(b);
        b = 1 ^ 0;
        System.out.println(b);
        b = 1 ^ 1;
        System.out.println(b);
    }
}
