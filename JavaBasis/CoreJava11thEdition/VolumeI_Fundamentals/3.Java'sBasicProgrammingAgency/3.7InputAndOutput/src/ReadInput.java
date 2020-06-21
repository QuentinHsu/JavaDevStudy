import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        // nextLine 方法读取一行输入，因为可能包含空格
        String name = in.nextLine();
        // 读取一个单词，以空白符作为分隔符
        String firstName = in.next();
        // 读取一个整数，调用 nextInt 方法
        System.out.println("How old are you? ");
        int age = in.nextInt();
        // 读取一个浮点数，调用 nextDouble 方法
        double bodyWeight = in.nextDouble();
    }
}
