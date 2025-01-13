package Payment;

public class Payroll{

    public void processPayroll(Employee employee)
    {
        System.out.println("processing payroll for: "+ employee.getName() + " with salary $" + employee.getSalary());
    }
}
