package BasicDataTypes;

public class Boolean {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3;  // 计算结果为 true
        int ageDefault = 12;
        boolean isAdult = ageDefault >= 18;    // 计算结果为 false
        System.out.println("isGreater 的计算值为：" + isGreater);
        System.out.println("isAdult 的计算值为：" + isAdult);
        /*
            Java语言对布尔类型的存储并没有做规定，
            因为理论上存储布尔类型只需要 1 bit，
            但是通常JVM内部会把boolean表示为4字节整数。
         */
    }
}

