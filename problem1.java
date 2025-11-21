 public class problem1 {
    String name;
    int age;

    problem1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        problem1 p1 = new problem1("Rafi", 20);
        problem1 p2 = new problem1("Ayan", 22);

        p1.display();
        p2.display();
    }
}
