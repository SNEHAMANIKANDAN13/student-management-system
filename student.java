import java.util.*;

class Student {

    int id;
    String name;
    int mark;

    Student(int id, String name, int mark) {

        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    void display() {

        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Mark : " + mark);

        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student(101,"Sneha",90);
        Student s2 = new Student(102,"Kerrthana",92);

        ArrayList<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);

        for(Student s : students) {

            s.display();
        }
    }
}