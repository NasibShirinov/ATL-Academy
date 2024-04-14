package A_Happy_Family;

public class Human {
    String name;
    String surname;
    int yearOfBirth;
    int IQlevel;
    Pet pet;
    Human mother;
    Human father;
//    int [][] =


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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getIQlevel() {
        return IQlevel;
    }

    public void setIQlevel(int IQlevel) {
        this.IQlevel = IQlevel;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    String greetPet(Pet nameOfPet) {
        return  "Hello, " + nameOfPet;
    }

    String describePet() {
        String sly = pet.tricklevel > 50 ? "sly": "very sly";
        return "display the information about your pet: " +
                "\"I have a "+ pet.species + ", he is " + pet.age + " years old, " +
                "he is " + sly;
    }

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Human(String name, String surname, int yearOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int yearOfBirth, int IQlevel, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.IQlevel = IQlevel;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
