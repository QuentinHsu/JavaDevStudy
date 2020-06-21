/*
    3.4.3 常量 P36
    类常量
 */
public class ClassConstant {
    public static final double CM_PER_INCH = 2.54;
    // 类常量的定义于 main 方法的外部，
    // 以便在同一个类的其他方法中也可以访问使用到这个变量
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHight = 11;
        System.out.println("Paper size in centimeters: "
                            + paperWidth * CM_PER_INCH
                            + " By "
                            + paperHight * CM_PER_INCH);
    }
}
