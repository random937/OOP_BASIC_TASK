class Employee {
    String name;
    String jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void updateSalary(double amount) {
        salary += amount;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Rafi", "Developer", 30000);
        e.updateSalary(5000);
        System.out.println("Updated Salary: " + e.salary);
    }
}