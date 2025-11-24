package crudproject;

import java.util.Scanner;

public class MainStudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentOperations op = new StudentOperations();

        while (true) {
            System.out.println("\n--- Student CRUD Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    op.addStudent(new Student(id, name, course));
                    break;

                case 2:
                    op.showStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    Student s = op.searchStudent(sc.nextInt());
                    if (s != null) System.out.println(s);
                    else System.out.println("Not Found");
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String uname = sc.nextLine();
                    System.out.print("New Course: ");
                    String ucourse = sc.nextLine();
                    op.updateStudent(uid, uname, ucourse);
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    op.deleteStudent(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
