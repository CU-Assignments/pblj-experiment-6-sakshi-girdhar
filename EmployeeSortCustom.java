import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age + ", Salary: " + salary;
    }
}

public class EmployeeSortCustom {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aman", 25, 50000));
        employees.add(new Employee("Babu", 30, 60000));
        employees.add(new Employee("Karan", 22, 40000));
        employees.add(new Employee("Rahul", 28, 70000));

        // Sorting by Name (Custom Comparator)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });
        System.out.println("\nSorted by Name:");
        for (Employee e : employees) System.out.println(e);

        // Sorting by Age (Custom Comparator)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.age, e2.age);
            }
        });
        System.out.println("\nSorted by Age:");
        for (Employee e : employees) System.out.println(e);

        // Sorting by Salary (Custom Comparator)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.salary, e2.salary);
            }
        });
        System.out.println("\nSorted by Salary:");
        for (Employee e : employees) System.out.println(e);
    }
}
