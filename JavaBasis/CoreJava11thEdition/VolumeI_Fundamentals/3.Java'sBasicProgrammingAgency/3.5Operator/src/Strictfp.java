/*
    进行严格的浮点数计算
    Java strictfp关键字确保了在浮点变量中执行操作时，您将在每个平台上获得相同的结果。
    精度因平台而异，这就是Java编程语言提供了strictfp关键字的原因，因此您在每个平台上都得到相同的结果。
    因此，现在您可以更好地控制浮点算法了。
 */
public class Strictfp {
    public static strictfp void main(String[] args) {
        var a = 10.0;
        var b = 3.0;
        var c = 5.0;
        System.out.println("a / b = " + a / b);
    }
}
