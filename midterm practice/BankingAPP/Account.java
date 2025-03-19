public class Account {
    private String _fullName;
    private Double _accountBalance;

    public String getName() {
        return _fullName;
    }

    public double getBalance() {
        return _accountBalance;
    }

    public void setName(String Name) {
        _fullName = Name;
    }

    public void setBalance(Double Balance) {
        _accountBalance = Balance;
    }

    public void deposit(double amount) {
        _accountBalance = _accountBalance + amount;
    }

    public void withdraw(double amount) {
        if (_accountBalance < amount) {
            System.out.println("insufficient balance!");
        } else {
            _accountBalance = _accountBalance - amount;
        }

    }
}
