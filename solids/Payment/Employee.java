package Payment;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name,String position, double salary)
    {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void EmployeeInformation()
    {
        System.out.println("Employee name: " + name);
        System.out.println("Employee position: " + position);
        System.out.println("employee salary: " + salary);
    }
// public void generatePlayslip()
// {
//     System.out.println("payslip for: "+ name + ": $" + salary);
// }

// public void processPayroll()
// {
//     System.out.println("processing payroll for: "+ name + "with salary $" + salary);
// }

}
