public class Employees {
    protected String _name;
    protected double _hours;
    protected double _hourlySalary;
    
    public void setName(String name){
        _name =name;
    }
    public void setHours(double hours){
        _hours =hours;
    }
    public void setsalary(double hourlySalary){
        _hourlySalary =hourlySalary;
    }


public double calculatePay(){
    return _hours *_hourlySalary;
}
}