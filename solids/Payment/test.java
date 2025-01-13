package Payment;

public class test {
    public static void main(String[] args) {
        Employee person1 = new Employee("krista", "homeless Hobo", 0.42);
        Payroll payroll = new Payroll();
        Payslip payslip = new Payslip();

        person1.EmployeeInformation();
        payroll.processPayroll(person1);
        payslip.generatePlayslip(person1);
        
    }
}
