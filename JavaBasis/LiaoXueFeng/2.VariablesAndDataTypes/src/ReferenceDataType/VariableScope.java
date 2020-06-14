package ReferenceDataType;

public class VariableScope {
    public static void main(String[] args) {
        int i = 0;  // 变量 i 从这里开始定义
        {
            int x = 1;  // 变量 x 从这里开始定义
            {
                String s = "Hi!";    // 变量 s 从这里开始定义
                System.out.println("第一个变量 s 的值：" + s);
            }// 变量 s 作用域到此结束
            /*
                注意，这是一个新的变量 s ,它和上面的变量同名
                但是因为作用域的不同，它俩是两个不同的变量
             */
            String s = "Hello！";
            System.out.println("第二个变量 s 的值：" + s);
        } // 至此，x 和 s 的作用域都到此结束
        System.out.println("该方法中命名的第一个变量 i 的值：" + i);
    }
}
