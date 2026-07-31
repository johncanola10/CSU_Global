import java.util.Comparator;

public class RollNoComparator implements Comparator<Student_Array> {
    @Override
    public int compare(Student_Array s1, Student_Array s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}