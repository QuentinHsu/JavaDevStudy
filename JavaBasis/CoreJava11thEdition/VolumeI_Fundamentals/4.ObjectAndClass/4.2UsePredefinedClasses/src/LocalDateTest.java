import java.time.LocalDate;
import java.util.Date;

//
public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println(new Date());         // Mon Jun 22 11:54:59 CST 2020
        System.out.println(LocalDate.now());    // 2020-06-22
        System.out.println(LocalDate.of(2020, 6, 22));  // 2020-06-22

        LocalDate newDate1 = LocalDate.of(2016,9,1);
        System.out.println(newDate1);   // 2016-09-01
        // 跳转到指定天数距离的日期
        LocalDate newDate1Add = newDate1.plusDays(29);
        System.out.println(newDate1Add);    // 2016-09-30
        int year = newDate1Add.getYear();   // Date 类返回值均为 int
        int month = newDate1Add.getMonthValue();
        int day = newDate1Add.getDayOfMonth();
        System.out.println(year + "年" + month + "月" + day + "日");   // 2016年9月30日
    }
}
