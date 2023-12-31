public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String id;

    public Employee(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Employee() {
        this.firstName = "plony";
        this.lastName = "almony";
        this.id = "0";
    }

    // Getters and setters for all fields

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id.equals(employee.id);
    }

    public abstract double earnings();
}
