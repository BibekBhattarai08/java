public class Program {
    public static void main(String[] args) {
        // Create one object of each class
        Employee emp = new Employee();
        Manager mgr = new Manager();
        CEO ceo = new CEO();

        // Initialize the regular employee object
        emp.setName("Joe Blue");
        emp.setHours(41.5);
        emp.setHourlySalary(35);

        // Initialize the manager object
        mgr.setName("Mr Boss");
        mgr.setHours(11.5);
        mgr.setHourlySalary(350);
        mgr.setBonus(10000.00);

        // Initialize the CEO object
        ceo.setName("Jeff Bezos");
        ceo.setHours(3);
        ceo.setHourlySalary(1650);
        ceo.setBonus(100000.00);
        ceo.setStockPrice(194.54);
        ceo.setSharesSold(1000);

        // Calculate and print the pay amount for each employee
        double empPay = emp.calculatePay();
        double mgrPay = mgr.calculatePay();
        double ceoPay = ceo.calculatePay();

        System.out.println("The employee's pay is $" + empPay);
        System.out.println("The manager's pay is $" + mgrPay);
        System.out.println("The CEO's pay is $" + ceoPay);
    }
}