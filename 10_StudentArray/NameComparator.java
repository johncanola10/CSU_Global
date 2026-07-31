import java.util.Comparator;

public class NameComparator implements Comparator<Student_Array> {
    @Override
    public int compare(Student_Array s1, Student_Array s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}