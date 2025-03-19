public class car {
    public String _model;
    public int _year;
    public double _price;

    public void setModel(String model) {
        _model = model;

    }

    public void setYear(int year) {
        _year = year;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public String getModel() {
        return _model;
    }

    public int getYear() {
        return _year;

    }

    public double getPrice() {
        return _price;
    }

    public static void main(String[] args) {
        car one = new car();
        one.setModel("porshe");
        one.setYear(2024);
        one.setPrice(76788.7);
        System.out.println(one.getModel());
        System.out.println(one.getYear());
        System.out.println(one.getPrice());

    }

}
