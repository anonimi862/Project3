public class CommissionEmployee extends Employee {
    private float grossSales;
    private int commission;

    public CommissionEmployee(String firstName, String lastName, String id, float grossSales, int commission) {
        super(firstName, lastName, id);
        setGrossSales(grossSales);
        setCommission(commission);
    }

    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commission = 0;
    }

    // Getters and setters for grossSales and commission

    @Override
    public String toString() {
        return "CommissionEmployee{" + "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", grossSales=" + grossSales +
                ", commission=" + commission +
                '}';
    }

    @Override
    public double earnings() {
        return (commission / 100.0) * grossSales;
    }
}
