package inherpractice;

public class Manager extends Employee {
    private double _bonus;

    public void setbonus(double bonus) {
        _bonus = bonus;
    }

    @Override
    public double calculatepay() {
        return super.calculatepay()+_bonus;
    }

}
