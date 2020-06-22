import java.util.Calendar;
import java.util.GregorianCalendar;

// 更改器方法 和 访问器方法
public class MutatorAndAccessorMethod {
    public static void main(String[] args) {
        GregorianCalendar someDay = new GregorianCalendar(2020, 6, 22);
        // 注意！someDay 是个 对象，不是单纯的日期值
        System.out.println("初始日期值：" + someDay);
        someDay.add(Calendar.DAY_OF_MONTH, 356);
        System.out.println("被修改后的日期值：" + someDay);
        int newYear = someDay.get(Calendar.YEAR);
        System.out.println(newYear);    // 2021
        int newMonth = someDay.get(Calendar.MONTH) + 1;
        int newMonth2 = someDay.get(Calendar.MONDAY);
        System.out.println(newMonth2);
    }
}
