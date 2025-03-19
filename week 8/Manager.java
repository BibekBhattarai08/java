public class Manager  extends Employees{
    private double _bonus;

    public void SetBonus(double bonus){
        _bonus=bonus;
    }

    public double calculatePay(){
        return _hours *_hourlySalary + _bonus;
    }
    
}
