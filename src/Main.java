public class Main {
    private static final int EMPLOYEE_NUMBER = 10;

    public static void main(String[] args) {

        final Employee[] employees = new Employee[EMPLOYEE_NUMBER];

        employees[0] = new Employee("Сьянов Тимофей Александрович", 4, 122_000);
        employees[1] = new Employee("Ратникова Марина Валерьевна", 1, 109_000);
        employees[2] = new Employee("Иванова Алла Федоровна", 4, 103_000);
        employees[3] = new Employee("Дудка Ольга Александровна", 3, 137_000);
        employees[4] = new Employee("Роскач Тимофей Сергеевич", 5, 114_000);
        employees[5] = new Employee("Яхно Вячеслав Николаевич", 2, 70_000);
        employees[6] = new Employee("Мелкумян Сергей Владмимирович", 5, 100_000);
        employees[7] = new Employee("Верас Светлана Николаевна", 2, 105_000);
        employees[8] = new Employee("Бараненко Максим Витальевич", 5, 98_000);
        employees[9] = new Employee("Бондарь Сергей Степанович", 3, 110_000);

        listEmployee(employees);

        System.out.println("Сумма затра на зарплаты - " + getSalarySum(employees));
        System.out.println("Сотрудник с минимальной зарплатой - " + getMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой - " + getMaxSalary(employees));
        System.out.println("Средняя зарплата - " + getAverageSalary(employees));
        System.out.println("Список сотрудников: " );

        printListEmployee(employees);

    }

    private static void listEmployee(Employee[] employee) {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    private static int getSalarySum(Employee[] employee) {
        int salarySum = 0;
        for (Employee employees : employee) {
            salarySum += employees.getSalary();
        }
        return salarySum;
    }
    private static Employee getMinSalary(Employee[] employees){
        Employee employeeMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }
    private static Employee getMaxSalary(Employee[] employees) {
        Employee employeeMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }
    private static double getAverageSalary(Employee[] employees) {
        int salarySum = getSalarySum(employees);
        return (double) salarySum / employees.length;

    }
    private static void printListEmployee(Employee[] employee) {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

}