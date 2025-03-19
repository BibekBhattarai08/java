public class Employee {
    protected String _name; // The employee's
    protected double _hours; // The number of hours worked in this pay period
    protected double _hourlySalary; // The employee's hourly salary in dollars

    // Setters for this class
    public void setName(String name) {
        _name = name;
    }

    public void setHours(double hours) {
        _hours = hours;
    }

    public void setHourlySalary(double hourlySalary) {
        _hourlySalary = hourlySalary;
    }

    // Returns the amount to pay a regular employee
    public double calculatePay() {
        return _hours * _hourlySalary;
    }

}
