public class Doge {
    private String _name;
    private double _weight;

    // gettere and settere
    public void setName(String name) {
        _name = name;
    }

    public void setWeight(double weight) {
        _weight = weight;
    }

    public String getName() {
        return _name;
    }

    public void bark() {
        if (_weight < 30) {
            System.out.println(_name + " says Yip ! Yip");
        } else {
            System.out.println(_name + " says woof ! woof !");
        }

    }

    public static void main(String[] args) {
        Doge one = new Doge();
        one.setName("thor");
        one.setWeight(20);

        Doge two = new Doge();
        two.setName("tiny");
        two.setWeight(50);

        one.bark();
        two.bark();

        System.out.println("the dogs names are " + one.getName() + " and " + two.getName());

    }

}