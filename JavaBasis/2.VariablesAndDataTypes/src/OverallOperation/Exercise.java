package OverallOperation;

public class Exercise {
    public static void main(String[] args) {
        int n = 101;
        // TODO: sum = 1 + 2 + ... + n
        int sum = (n + 1) * (n / 2);

        System.out.println(sum);
        System.out.println(sum == 5050 ? "测试通过" : "测试失败");

    }
}
