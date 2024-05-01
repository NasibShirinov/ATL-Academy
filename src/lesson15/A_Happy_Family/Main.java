package lesson15.A_Happy_Family;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", "Rex", 4, 99, new String[]{"eat", "sleep", "play"});
        Pet cat = new Pet("Cat" , "Mestan", 3, 75, new String[] {"eat", "laying"});

        Human mother = new Human("Lale", "Ibrahimova", 1944);
        Human father = new Human("Behsir", "Ibrahimov", 1942);
        Family mamedovs = new Family(father, mother, new Human[2], cat);
        Human elnur = new Human("Elnur", "Ibrahimov", 1985, mother, father, mamedovs);
        mamedovs.addChild(elnur);

//        mamedovs.deleteChild();
//        elnur.setMother(mother);
//        elnur.setFather(father);
//        Human emin = new Human("Emin", "Ibrahimov", 1994, 88, dog, mother, father);
//        Human sebine = new Human("Sebine", "Ibrahimova", 1996, 85, cat, mother, father);

        // concat pool da yaranmir, heapde yaranir
//
//
//        System.out.println(dog.eat());
//        System.out.println(dog.respond(dog));
//        System.out.println(emin.describePet());
//        System.out.println(elnur.greetPet(dog));
    }
}
