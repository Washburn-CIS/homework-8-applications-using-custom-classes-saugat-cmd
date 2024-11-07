import java.util.Scanner;

public class GradeBook {
    private static Student[] students;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        students = new Student[] { new Student(), new Student() };
        students[0].setFirstName("Alan");
        students[1].setFirstName("Ada");
        students[0].setLastName("Turing");
        students[1].setLastName("Lovelace");
        students[0].setGrade(95);
        students[1].setGrade(87);

        System.out.println("Welcome to the CM111 Grade Book App!");

        while(true) {
            System.out.println("\nPlease make a selection:\n");
            System.out.println("1) List Class Grades");
            System.out.println("2) Exit");
            System.out.print("\nPlease choose an option: ");
            String choice = input.nextLine();
            System.out.println();
            switch(choice) {
                case "1": for (Student student : students) {
                        System.out.println(student.getLastName() + ", " + student.getFirstName() + ": " + student.getGrade());
                    }
                    break;
                    continue;
                case "2":
                    System.out.println("Goodbye!");
                    return;

                // Challenge: write another option to allow updating grades for a selected student
            }
        }
    }
}
