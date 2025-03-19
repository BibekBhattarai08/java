public class Manager extends Employee {
    protected double _bonus;  // The manager's bonus

    // Setters for this class
    public void setBonus(double bonus) {
        _bonus = bonus;
    }

    // Returns the amount to pay this manager
    @Override
    public double calculatePay() {
        return super.calculatePay() + _bonus;
    }
}
