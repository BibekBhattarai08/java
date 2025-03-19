public class CEO extends Manager {
    private double _stockPrice;
    private int _sharesSold;

    // Setters for this class
    public void setStockPrice(double stockPrice) {
        _stockPrice = stockPrice;
    }
    
    public void setSharesSold(int sharesSold) {
        _sharesSold = sharesSold;
    }
    
    // Returns the amount to pay the CEO
    @Override
    public double calculatePay() {
        return super.calculatePay() + _stockPrice * _sharesSold;
    }
}
