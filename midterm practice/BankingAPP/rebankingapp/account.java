package rebankingapp;

public class account {
    private String _fullname;
    
    private double _accountbalance;
    //getter and setter
    /* 

    public void setName(String fullname) {
        _fullname = fullname;
    }

    public void setBalance(double accountbalance) {
        _accountbalance = accountbalance;
    }
*/
//constructor.
 public account (String fullname, double accountbalance ){
    _fullname = fullname;
    _accountbalance = accountbalance;

    }

   public String getName() {
        return _fullname;
    }

    public double getBalance() {
        return _accountbalance;
    }

    public void deposit(double depAmt) {
        _accountbalance += depAmt;
    }

    public void withdraw(double witAmt) {
        if (witAmt > 0 && witAmt <= _accountbalance) {
            _accountbalance -= witAmt;

        } else {
            System.out.println("invalid amt or insufficient balance");

        }
    }

}
