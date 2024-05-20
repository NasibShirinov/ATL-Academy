package lesson38.task;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student [] students = {new Student(237L, "Smith", 24),
                               new Student(238L, "Krith", 21),
                               new Student(235L, "Frith", 27)};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("---------- Sort Name -------");
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student2.getName().compareTo(student1.getName());
            }
        });

        System.out.println(Arrays.toString(students));

        System.out.println("---------- Sort Age -------");
        Arrays.sort(students, (student1, student2) -> Integer.compare(student1.getAge(), student2.getAge()));
        System.out.println(Arrays.toString(students));
    }
}
