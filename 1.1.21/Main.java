import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;
            // each line has 3 parts seperated by " ", Ex: Name 10 3
            String[] splitLine = line.split(" ");
            Student newStudent = new Student(splitLine[0], Integer.parseInt(splitLine[1]), Integer.parseInt(splitLine[2]));
            students.add(newStudent);
        }
        System.out.printf("%-10s", "Name");
        System.out.printf("%-10s", "First");
        System.out.printf("%-10s", "Second");
        System.out.println("DividingResult");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
