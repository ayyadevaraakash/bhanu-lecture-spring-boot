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
    public boolean equals(Object thatObj) {
        Student that = (Student) thatObj;
        if (this.name == that.name && this.roll == that.roll) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.roll, this.name);
    }
}

public class EqualsHashCodeDemo {
    public static void main(String[] args) {
        Student s1 = new Student(17, "Akash");
        Student s2 = new Student(17, "Akash");

        Set<Student> st = new HashSet<>();
        st.add(s1);
        st.add(s2);

        System.out.println(st.size());

        // if (s1.equals(s2)) {
        //     System.out.println("Both students are same");
        // } else {
        //     System.out.println("Both students are different");
        // }
    }
}