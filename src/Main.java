public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.id = 3);

        Employee employee = new Employee();
        System.out.println(employee.age = 15);

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.List();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add();
        employeeManager.List();
        employeeManager.BestEmployee();

    }
}