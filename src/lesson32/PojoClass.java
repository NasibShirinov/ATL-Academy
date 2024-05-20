package lesson32;

import java.lang.reflect.Field;
import java.util.Objects;

public class PojoClass {
    private String name;
    private String surname;
    private int age;

    public PojoClass(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PojoClass() {
    }

    @Override
    public String toString() {
        return "PojoClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PojoClass pojoClass = (PojoClass) o;
        return age == pojoClass.age && Objects.equals(name, pojoClass.name) && Objects.equals(surname, pojoClass.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // How to chancge private field
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PojoClass pojoClass = new PojoClass("dss", "dada", 15);
        Field age = pojoClass.getClass().getDeclaredField("name");
        age.setAccessible(true);
        age.set(pojoClass, "fivb");
        System.out.println(pojoClass.getName());
    }

   // Nesib Maawi sorus ,sonra denen vaxti 5 gun yox 4 gun etsin.
}
