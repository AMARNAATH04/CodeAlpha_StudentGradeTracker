import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input student details
        for(int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student grade: ");
            int grade = sc.nextInt();
            sc.nextLine();

            names.add(name);
            grades.add(grade);
        }

        // Calculate values
        int total = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for(int grade : grades) {

            total += grade;

            if(grade > highest) {
                highest = grade;
            }

            if(grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) total / n;

        // Display Report
        System.out.println("\n========== STUDENT REPORT ==========");

        for(int i = 0; i < n; i++) {
            System.out.println(names.get(i) + " : " + grades.get(i));
        }

        System.out.println("\nAverage Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score : " + lowest);

        sc.close();
    }
}