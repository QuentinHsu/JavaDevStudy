package OverallOperation;
// 类型提升
public class TypePromotion {
    public static void main(String[] args) {
        short s = 1234;
        int i = 123456;
        int x = s + i;
        System.out.println("x = s + i = " + x);
//      short y = s + i; //编译错误！
//      若要 得到 y = s + i，则需要这样
        short y = (short)(s + i);
        System.out.println("y = s + i = " + y + "（类型为 short）");
//      short y = (short)s + (short)i; 这样写是不符合规范的
    }
}
