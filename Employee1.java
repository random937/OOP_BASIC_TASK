import java.time.LocalDate;
import java.time.Period;

class Employee1 {
    String name;
    double salary;
    LocalDate hireDate;

    Employee1(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    int yearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1("Rafi", 30000, LocalDate.of(2020, 1, 1));
        System.out.println("Years of Service: " + e.yearsOfService());
    }
}