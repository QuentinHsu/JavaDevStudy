package ReferenceDataType;

public class constant {
    public static void main(String[] args) {
        final double Pi = 3.14;
        System.out.println("Pi 的初始值：" + Pi);
        // 尝试更改 Pi 的值
//        Pi = 3.1415;
//        System.out.println("Pi 的当前值：" + Pi);
        /*
            更改 Pi 值后，编译执行报错
            Error:(8, 9) java: 无法为最终变量Pi分配值
         */
    }
}
