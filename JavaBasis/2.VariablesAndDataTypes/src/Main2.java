public class Main2 {
    public static void main(String[] args) {
        int n = 100;    // 定义变量 n，并赋值 100
        System.out.println("初始时，n = " + n);  // 打印 n 的值

        n = 200;
        System.out.println("重新赋值后，n = " + n);

        int x = n;
        System.out.println("把 n 的当前值赋值给 x，x = " + x);

        x = x + 100;
        System.out.println("x 被增值后，x = " + x);
        System.out.println("当前的 n = " + n);
    }
}
