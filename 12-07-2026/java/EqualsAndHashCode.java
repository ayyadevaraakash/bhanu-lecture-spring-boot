import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student that = (Student) obj;
        if (this.roll == that.roll && that.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.roll);
    }
}

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Student s1 = new Student(17, "Akash");
        Student s2 = new Student(17, "Akash");
        // if (s1.equals(s2)) {
        //     System.out.println("Both are same");
        // } else {
        //     System.out.println("Both are different");
        // }

        Set<Student> st = new HashSet<>();
        st.add(s1);
        st.add(s2);
        System.out.println(st.size());

        System.out.println(s1);
    }
}
