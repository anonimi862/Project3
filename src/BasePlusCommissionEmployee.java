public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        setBaseSalary(baseSalary);
    }

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    // Getter and setter for baseSalary

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", grossSales=" + grossSales +
                ", commission=" + commission +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }
}
