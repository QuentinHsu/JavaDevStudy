package BooleanOperation;

public class Exercise {
    public static void main(String[] args) {
        int age = 7;
        // primary student 的定义：6 ~ 12 岁
        boolean isPrimaryStudent = (6 <= age && age <= 12) ? true : false;
        System.out.println(isPrimaryStudent ? "Yes" : "No");

        /*
            在 Boolean 中，对于区间取值的条件，
            不可以写成：num1 < age < num2
            应写成：num1 < age && age < num2
         */
    }
}
