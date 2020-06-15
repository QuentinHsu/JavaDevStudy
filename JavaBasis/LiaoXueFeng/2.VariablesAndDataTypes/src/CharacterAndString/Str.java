package CharacterAndString;
// 不要将类名设置为 String，会导致你 无法使用 String 来声明变量。
public class Str {
    public static void main(String[] args) {
        //      字符串类型数据，只能使用 双引号 进行包围以表示。
        String s1 = "a";      // 空字符串，包含 0 个字符
        String s2 = "A";      // 包含 1 个字符
        String s3 = "中文 ABC";    // 包含 6 个字符，其中有 1 个空格
        System.out.println(s2);

        String sayWords = "He say: \"Hi! Look this!\"";
        System.out.println(sayWords);

        // 字符串拼接
        String s4 = "Hello";
        String s5 = "Java!";
        String s6 = "\u4e2d";
        System.out.println(s4 + " " + s5 + " " + s6);

        // 多行字符串
        String s7 = "first line \n"
                  + "second line \n"
                  + "third line" + "\n"
                  + "end";
        System.out.println("\n多行字符串拼接：\n" + s7);

        String s8 = "";
    }
}
