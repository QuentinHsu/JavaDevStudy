public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeDefault[] staff = new EmployeeDefault[3];

        staff[0] = new EmployeeDefault("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new EmployeeDefault("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new EmployeeDefault("Tony Tester", 40000, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (EmployeeDefault e: staff)
            e.raiseSalary(5);
        // print out information about all Employee objects
        for (EmployeeDefault e: staff)
            System.out.println("name = " + e.getName()
                                + ", salary = " + e.getSalary()
                                + ", hireDay = " + e.getHireDay());
    }
}
