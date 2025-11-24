package crudproject;

import java.util.ArrayList;

public class StudentOperations {

    ArrayList<Student> list = new ArrayList<>();

    // Add student
    public void addStudent(Student s) {
        list.add(s);
        System.out.println("Student Added Successfully!");
    }

    // Display all
    public void showStudents() {
        if (list.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("ID  |  Name  |  Course");
        for (Student s : list) {
            System.out.println(s);
        }
    }

    // Search
    public Student searchStudent(int id) {
        for (Student s : list) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    // Update
    public void updateStudent(int id, String name, String course) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(name);
            s.setCourse(course);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Delete
    public void deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            list.remove(s);
            System.out.println("Student deleted!");
        } else {
            System.out.println("Student not found.");
        }
    }
}
