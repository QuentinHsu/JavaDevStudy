package CharacterAndString;
// String is Object
public class StringIsObject {
    public static void main(String[] args) {
        String s1 = "a";
        System.out.println("s1 的初始值：" + s1);
        String s2 = s1;
        s1 = "b";
        System.out.println("s1 被更改后的值：" + s1);
        System.out.println("s2 的值：" + s2);
    }
}
