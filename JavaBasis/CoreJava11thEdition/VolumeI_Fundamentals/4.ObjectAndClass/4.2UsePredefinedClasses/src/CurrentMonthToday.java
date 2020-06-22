import java.time.DayOfWeek;
import java.time.LocalDate;

// 显示当前月的日历，并星号标注当天
public class CurrentMonthToday {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int toDay = date.getDayOfMonth();
        date = date.minusDays(toDay - 1);
        // LocalDate类的minusDays()方法用于从该LocalDate中减去指定天数并返回LocalDate的副本。
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday,..., 7 = Sunday
        System.out.println(value);  // 1, 2020-6-22 is Monday
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i ++);
        System.out.print("");   // 源代码的缩进功能代码，并不适用所有情况
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == toDay)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
