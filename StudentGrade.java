import java.util.Scanner;
public class StudentGrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.print("Enter Student Name:");
        String name = sc.nextLine();
        System.out.print("Enter marks in Subject 1:");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks in Subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks in Subject 3:");
        int sub3 = sc.nextInt();
        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("\n----- Student Report -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        sc.close();
    }
    
}

