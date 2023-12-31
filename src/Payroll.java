public class Payroll {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new HourlyEmployee("John", "Doe", "123", 40, 15.0f);
        employees[1] = new CommissionEmployee("Jane", "Smith", "456", 5000, 10);
        employees[2] = new BasePlusCommissionEmployee("Mike", "Johnson", "789", 8000, 15, 1000);

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Earnings: " + employee.earnings());
            System.out.println("------------------------------");
        }
    }
}
