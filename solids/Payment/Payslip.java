package Payment;

public class Payslip{

public void generatePlayslip(Employee employee)
{
    System.out.println("Payslip for: " + employee.getName() + ": $" + employee.getSalary());
}


}
