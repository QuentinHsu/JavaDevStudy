package CharacterAndString;
/*

 */

public class Character {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '中';
        // 转义字符 + Unicode 编码表示字符
        char c3 = '\u0041'; // 'A'，16进制：0041，10进制：65
        char c4 = '\u4e2d'; // '中'，16进制：4e2d，10进制：20013
        System.out.println(c3 + c4);
        // char 类型数据之间不存在字符拼接！拼出来的结果是按十进制进行加法计算的结果

        // 但 char 和 String 类型数据一起拼接，能拼接如愿
        // 因为和 String 类型数据拼接时，其他类型数据会先自动转型为字符串类型
        String s1 = "，这是 char 类型数据";
        System.out.println(c1 + s1);
    }
    // \n
}
/*
    禁止在任何方法中的注释内容书写转移字符：\n
    因为会导致编译报错
 */