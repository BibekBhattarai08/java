public class Student {
    //variable declearation with appropriate datatypes
    private String _studentName;
    private int _id;
    private double _gpa;
    private double _creditsEarned;
    private boolean _onProbation = false;

    //constructor to create student object with specified names and ID's
    public Student(String studentName, int id) {
        _studentName = studentName;
        _id = id;
    }
    //method to increase credit by specified amounts
    public void addCredits(double amount) {
        if (amount > 0) {
            _creditsEarned += amount;
            System.out.println(amount + " credits added");
        } else {
            System.out.println("Invalid credit amount. Please enter a positive number.");
        }

    }
    //methods to change probation status either TRUE or False
    public void changeProbation() {
        /*
         * if (_onProbation = true){
         * _onProbation=false;
         * }
         * else{
         * _onProbation = true;
         * 
         * }
         */
        _onProbation = !_onProbation;

    }
//setters for remaining fields
    public void setGpa(double gpa) {
        _gpa = gpa;
    }

    public void setCreditsEarned(double creditsEarned) {
        _creditsEarned = creditsEarned;
    }

    public void setProbation(boolean onProbation) {
        _onProbation = onProbation;
    }

    // getters
    public String getStudentName() {
        return _studentName;
    }

    public int getId() {
        return _id;
    }

    public double getGpa() {
        return _gpa;
    }

    public double getcreditEarned() {
        return _creditsEarned;
    }

    public boolean getProbation() {
        return _onProbation;
    }
}
