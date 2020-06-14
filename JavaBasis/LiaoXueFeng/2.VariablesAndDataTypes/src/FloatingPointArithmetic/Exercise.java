package FloatingPointArithmetic;
//根据一元二次方程ax^2+bx+c=0ax
//2
// +bx+c=0的求根公式
public class Exercise {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
//      TODO: 计算出一元二次方程的两个解
//      求平方根可用 Math.sqrt();
        double r1 = 0;
        double r2 = 0;
        r1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
        r2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println((r1 == 1 && r2 == -4 ? "方法逻辑测试通过" : "方法逻辑测试失败"));
    }
}
