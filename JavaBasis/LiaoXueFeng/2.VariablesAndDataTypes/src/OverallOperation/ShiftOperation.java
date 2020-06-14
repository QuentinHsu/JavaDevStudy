package OverallOperation;
// 移位运算
public class ShiftOperation {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("n 的初始值：" + n);
        int a = n << 1;
        System.out.println("对 n 进行左移 1 位：" + a);
        int a1 = n << 2;
        System.out.println("对 n 进行左移 2 位：" + a1);
        int a2 = n << 3;
        System.out.println("对 n 进行左移 2 位：" + a2);
        int a3 = n << 28;
        System.out.println("对 n 进行左移 28 位：" + a3);
        int a4 = n << 29;
        System.out.println("对 n 进行左移 29 位：" + a4);
        System.out.println("————————————————————————");
        int m = 28;
        System.out.println("m 的初始值：" + m);
        int M = m >> 1;
        System.out.println("对 m 进行右移 1 位：" + M);
        int M1 = m >> 2;
        System.out.println("对 m 进行右移 2 位：" + M1);
        int M2 = m >> 3;
        System.out.println("对 m 进行右移 3 位：" + M2);
    }
/*
    左移实际上就是不断地 ×2 ，右移实际上就是不断地 ÷2 。
 */
}
