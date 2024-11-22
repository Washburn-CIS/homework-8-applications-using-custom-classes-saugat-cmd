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
                    System.out.print("Enter the first name of the student whose grade you want to update: ");
                    String firstName = input.nextLine();
                    boolean studentFound = false;

                    for (Student student : students) {
                        if (student.getFirstName().equalsIgnoreCase(firstName)) {
                            System.out.print("Enter the new grade for " + student.getFirstName() + " " + student.getLastName() + ": ");
                            int newGrade = input.nextInt();
                            input.nextLine(); 
                            
                            if (newGrade >= 0 && newGrade <= 100) {
                                student.setGrade(newGrade);
                                System.out.println("Grade updated successfully!");
                            } else {
                                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                            }
                            studentFound = true;
                            break;
                        }
                    }

                    if (!studentFound) {
                        System.out.println("Student not found.");
                    }
                    break;

                case "3":
                    System.out.println("Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
