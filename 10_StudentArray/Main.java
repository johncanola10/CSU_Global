import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student_Array> students = new ArrayList<>();

        students.add(new Student_Array(110, "Mike", "1010 Psuedo St"));
        students.add(new Student_Array(101, "Jaxon", "710 A.I. Way"));
        students.add(new Student_Array(108, "Theodore", "123 Python Rd"));
        students.add(new Student_Array(104, "Lucy", "888 Javascript Ave"));
        students.add(new Student_Array(103, "Adara", "0000 HTML Blvd"));
        students.add(new Student_Array(106, "Sophia", "0505 CSS Dr"));
        students.add(new Student_Array(102, "Phillip", "404 NotFound Ln"));
        students.add(new Student_Array(109, "Luke", "505 Java St"));
        students.add(new Student_Array(105, "Krystal", "626 HeatStroke Ct"));
        students.add(new Student_Array(107, "Ava", "777 C++ Dr"));

        // Displays Unsorted List
        System.out.println("========Unsorted List========");
        printStudents(students);
        // Sorts by Name
        SelectionSort.sort(students, new NameComparator());
        System.out.println("\n===Sorted by Name===");
        printStudents(students);
        // Sorts by Roll Number
        SelectionSort.sort(students, new RollNoComparator());
        System.out.println("\n===Sorted by Roll Number===");
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student_Array> list) {
        for (Student_Array s : list) {
            System.out.println(s);
        }
    }
}