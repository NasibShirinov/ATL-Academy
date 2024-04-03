package lesson4_ObjectsAndMethods;

public class StringHascode {
    public static void main(String[] args) {
        String alma = "Alma";
        String alma1 = new String("Alma");
        System.out.println(alma.hashCode());
        System.out.println(alma1.hashCode());
        System.out.println(alma == alma1);
    }
}
