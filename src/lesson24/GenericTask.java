package lesson24;

import java.nio.file.OpenOption;
import java.util.Optional;

public class GenericTask {
    public static void main(String[] args) {
        requiredNonNull("vy");
    }


    private static <T> T requiredNonNull (T data) {
        // <T> - generic type
        // T - return type
        if (data == null) {
            return (T) Optional.empty();
        }
        return (T) Optional.of(data);
    }

//    private static <T> T requiredNonNull (T data) {
//        // <T> - generic type
//        // T - return type
//        if (data == null) {
//            throw new CustomNullPointerExeption();
//        } else {
//            return (T) Optional.empty();
//        }
//    }
}
