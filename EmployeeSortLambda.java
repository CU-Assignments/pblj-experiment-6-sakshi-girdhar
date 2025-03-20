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

public class EmployeeSortLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aman", 25, 50000));
        employees.add(new Employee("Babu", 30, 60000));
        employees.add(new Employee("Karan", 22, 40000));
        employees.add(new Employee("Rahul", 28, 70000));

        // Sorting by Name
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        // Sorting by Age
        employees.sort(Comparator.comparingInt(e -> e.age));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);

        // Sorting by Salary
        employees.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);
    }
}
