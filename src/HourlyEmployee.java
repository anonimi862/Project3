public class HourlyEmployee extends Employee {
    private int hours;
    private float wage;

    public HourlyEmployee(String firstName, String lastName, String id, int hours, float wage) {
        super(firstName, lastName, id);
        setHours(hours);
        setWage(wage);
    }

    public HourlyEmployee() {
        super();
        this.hours = 0;
        this.wage = 0;
    }

    // Getters and setters for hours and wage

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    @Override
    public double earnings() {
        return hours * wage;
    }
}
