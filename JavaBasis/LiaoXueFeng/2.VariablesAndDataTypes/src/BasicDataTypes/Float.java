package BasicDataTypes;

public class Float {
    public static void main(String[] args) {
        float f1 = 3.14f;       // float类型值结尾要带 f
        float f2 = 3.14e38f;    // 科学计数法，3.14×10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324;   // 科学计数法，4.9×10^-324
        System.out.println("double 类型的 d3 值为：" + d3);
    }
}
