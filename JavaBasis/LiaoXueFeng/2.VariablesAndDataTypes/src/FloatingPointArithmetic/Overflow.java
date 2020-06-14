package FloatingPointArithmetic;
// 溢出
public class Overflow {
    public static void main(String[] args) {
        double d1 = 0.0 / 0;    // NaN
        double d2 = 1.0 / 0;    // Infinity
        double d3 = -1.0 / 0;   // -Infinity
        System.out.println(d1 + "\n" + d2 + "\n" + d3);
    }
}
