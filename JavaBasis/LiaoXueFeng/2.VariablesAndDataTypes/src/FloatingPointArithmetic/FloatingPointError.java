package FloatingPointArithmetic;
// 浮点数运算误差
public class FloatingPointError {
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println("x = 1.0 / 10 = " + x);  // 0.1
        System.out.println("y = 1 - 9.0 / 10 = " + y);  // 0.09999999999999998
        System.out.println( x == y ? "x 和 y 的值相等" : "x 和 y 的值不相等");
        /*
            因为浮点数存在运算误差，所以上述比较方式，可能会存在错误的结果。
            正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数。
         */
        double r = Math.abs(x - y);
        if ( r < 2.7755575615628914E-18 ) { // x - y = 2.7755575615628914E-17
//           此处的 r 所小于的值，理解为 【精度】
            System.out.println("x 和 y 的值相等");
        } else {
            System.out.println("x 和 y 的值不相等");
        }
    }
}
