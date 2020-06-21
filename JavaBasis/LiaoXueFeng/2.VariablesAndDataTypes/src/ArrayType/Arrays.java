package ArrayType;

public class Arrays {
    public static void main(String[] args) {
        // 5位同学的成绩:
        int n1 = 68;
        int n2 = 79;
        int n3 = 91;
        int n4 = 85;
        int n5 = 62;
        // =>
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        /*
            Java的数组有几个特点：
            数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
            数组一旦创建后，大小就不可改变。
         */
        System.out.println(ns[1]);  //79
        System.out.println("ns 数组长度：" + ns.length);
//      System.out.println(ns[6]);    //超出长度，运行报错

        /*
            可不指定数组大小，指定初始化的元素
            编译器自动推算数组大小
         */

        int[] ns1 = new int[] {
                68, 79, 91, 62
        };
        System.out.println("ns1's array length: " + ns1.length);
    }
}
/**
 * 文档性注释
 * 可用来自动生成文档
 */
