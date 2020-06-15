package CharacterAndString;
// 空值 null
/*
    引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象。
 */
public class NullValue {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = s1;
        String s3;      // 没有赋初始值，s3 也是 null（应该是没有 undefined 一说的
        s1 = "我不再是 null 了。";
        System.out.println("s1　的值：" + s1);
        System.out.println("s2 的值：" + s2);
    }
}
