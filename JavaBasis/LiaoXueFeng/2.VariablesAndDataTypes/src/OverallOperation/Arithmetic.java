package OverallOperation;
// 四则运算
public class Arithmetic {
    public static void main(String[] args) {
        int i = (100 + 200) * (99-88);
        int o = 7 * (34 * (45 / 5));
        int p = 11 * (13 / 3);  // => 11 * 4
        // 两个整数相除，只会得到整数部分
        System.out.println(i);
        System.out.println((o));
        System.out.println(p);
    }
}
