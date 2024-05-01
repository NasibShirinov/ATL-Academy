package lesson24;

public class CustomNullPointerExeption extends RuntimeException {
    public CustomNullPointerExeption() {
    }

    public CustomNullPointerExeption(String message) {
        super(message);
    }
}
