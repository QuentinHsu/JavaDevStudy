// 格式化输出
public class FormattedOutput {
    public static void main(String[] args) {
        double x = 10000.0 / 3.0;
        System.out.println(x);
        // 使用 printf 方法
        System.out.printf("%8.2f", x);
        /*  %8.2f
            打印 8 个字符，精度为 2
            于是是打印：
                前导 1 个空格 + 7个字符
                " 3333.33"
         */
        int age = 10;
        double weight = 50.4;
        String name = "Quentin Hsu";
        System.out.printf("%nHi! %s. Your age is %d, weight is %f.%n", name, age, weight);
        // 参数的顺序，要跟替换的顺序一致
        System.out.printf("%,.2f", 10000.0 / 3.0);  // 3,333.33
    }
}
