public class Dog {
    private String _name; // The dog's name
    private double _weight; // The dog's weight in kg
    // Prints what the dog's bark would sound like

    public void SetName(String name) {
        _name = name;
    }

    public void SetWeight(double weight) {
        _weight = weight;
    }

    public void bark() {
        if (_weight < 30) {
            System.out.println(_name + " says Yip! Yip!");
        } else {
            System.out.println(_name + " says Woof! Woof!");
        }
        
    }
} // End of class Dog
