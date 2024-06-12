package design_patterns.builder;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .brand("Brand")
                .model("Model")
                .category("Category")
                .build();
    }
}

