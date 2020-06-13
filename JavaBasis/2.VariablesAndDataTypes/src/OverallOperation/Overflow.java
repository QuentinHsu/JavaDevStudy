package OverallOperation;
// 溢出
public class Overflow {
    public static void main(String[] args) {
        int i = 2147483640;
        int j = 15;
        int sum = i + j;    // 结果溢出了……
        System.out.println("i + j 的结果为：" + sum);

        //为解决溢出问题，将数据类型从 int 换成 long 就好了
        long q = 2147483640;
        long w = 15;
        long sum1 = q + w;
        System.out.println("q + w 的结果为：" +sum1);

        int e = 123;
        e += 100;
        System.out.println("e 被赋值后：" + e);
    }
}
