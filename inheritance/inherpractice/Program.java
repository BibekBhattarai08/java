package inherpractice;

public class Program {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();

        emp.setName("bibek");
        emp.setHours(14);
        emp.setHourlysalary(100);

        mgr.setName("rolls");
        mgr.setHours(14);
        mgr.setHourlysalary(100);
        mgr.setbonus(100);

        double empPay = emp.calculatepay();
        double mgrPay = mgr.calculatepay();

        System.out.println("employee salary is" + empPay);
        System.out.println("manager salary is" + mgrPay);

    }

}
