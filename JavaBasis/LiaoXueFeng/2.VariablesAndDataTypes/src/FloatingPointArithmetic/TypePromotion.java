package FloatingPointArithmetic;
// 类型提升
public class TypePromotion {
    public static void main(String[] args) {
        int n = 5;
        double d1 = 1.2 + 24.0 / n; // 6.0
        System.out.println(d1);
        /*
            如果参与运算的两个数其中一个是整型（另一个是浮点型），
            那么整型可以”自动提升“到浮点型

            我觉得这里是指，”可以当作浮点型，参与计算“的意思。
         */
//        But，在复杂的计算中，变量类型并不会提升
        double d2 = 1.2 + 24 / 5;   // => 1.2 + 4 = 5.2
        /*
            有点点复杂的样子……
         */
    }
}
