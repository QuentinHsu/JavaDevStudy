package OverallOperation;
// 运算优先级
/*
    由高到低
        ()
        ! ~ ++ --
        * / %
        + -
        << >> >>>
        &
        |
        += -= *= /=
 */
public class OperationPriority {
    public static void main(String[] args) {
        int count = 4 * 11 / (1+3);
        System.out.println("4 * 11 / (1 + 3) = " + count);

    }
}
