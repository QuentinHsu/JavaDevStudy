import java.util.*;
//import java.util.Scanner;     //这是 IDEA 自动添加的内容

/**
 * 程序清单 3-2
 * This program demonstrates console input.
 * @version 1.10 2020-06-19
 * @author Quentin Hsu
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get first input
        System.out.println("What is your name? ");
        String name = input.nextLine();
//        String firstName = input.next();


        // get second input
        System.out.println("How old are you? ");
        int age = input.nextInt();

        // display output on console
        System.out.println("Hello, "
                            + name
                            + ". Next year, you'll be "
                            + (age + 1)
                            + ".");
//        System.out.println("Your firstName: " + firstName);
    }
}
