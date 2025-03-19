package inherpractice;

public class Employee {
    private String _name;
    private double _hours;
    private double _hourlySalary;

    public void setName(String name) {
        _name = name;
    }

    public void setHours(double hours) {
        _hours = hours;
    }

    public void setHourlysalary(double hourlySalary) {
        _hourlySalary = hourlySalary;
    }

    public String getName() {
        return _name;
    }

    public double getHours() {
        return _hours;
    }

    public double getHourlySalary() {
        return _hourlySalary;
    }

    public double calculatepay() {
        return _hours * _hourlySalary;
    }

}
