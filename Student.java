import java.util.ArrayList;

class Student {
    String name;
    String grade;
    ArrayList<String> courses = new ArrayList<>();

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    void addCourse(String course) {
        courses.add(course);
    }

    void removeCourse(String course) {
        courses.remove(course);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }

    public static void main(String[] args) {
        Student s = new Student("Rafi", "A");

        s.addCourse("Math");
        s.addCourse("Science");
        s.removeCourse("Math");

        s.display();
    }
}