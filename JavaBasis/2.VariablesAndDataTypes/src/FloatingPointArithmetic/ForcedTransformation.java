package FloatingPointArithmetic;
// 强制转型
public class ForcedTransformation {
    public static void main(String[] args) {
        int n1 = (int) 12.3;    // 12
        int n2 = (int) 12.7;    // 12
        int n3 = (int) -12.7;   // -12
        int n4 = (int)(12.7 + 0.5); // 13
        int n5 = (int) 1.2e20;  // 2147483647
        System.out.println(n1 + "\n" + n2 + "\n" + n3 +
                                "\n" + n4 + "\n" + n5);
//      四舍五入
        double d1 = 2.6;
        int n6 = (int)(d1 + 0.5);
        System.out.println("d1(2.6) 被加上 0.5 以进行强制转型： " + n6);
    }

}
