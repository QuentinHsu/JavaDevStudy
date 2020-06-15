package BooleanOperation;
// 基础布尔
public class BasicBoolean {
    public static void main(String[] args) {
        boolean isGreater = 5 > 3;
        int age = 12;
        boolean isZero = age == 0;
        boolean isNonZero = !isZero;
        boolean isAdult = age >= 18;
        boolean isTeenager = age > 6 && age < 18;

        // 短路运算
        boolean b1 = 5 < 3;
        boolean result1 = b1 && ( 5 / 0 > 0);
        System.out.println(result1);
        boolean result2 = true || (5 / 0 > 0); // true
        System.out.println(result2);

        // 三元运算
        int n = -100;
        int x = n >= 0 ? n : -n;    //100
        System.out.println(x);
    }
}
