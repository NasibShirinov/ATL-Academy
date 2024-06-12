package design_patterns.builder;

public class Car {
    private final String brand;
    private final String model;
    private final String category;
    private final String build;


    public Car(Builder builder, String brand, String model, String category) {
        this.brand = brand;
        this.model = model;
        this.category = category;
        this.build = builder.toString();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

    public static class Builder {
        private String brand;
        private String model;
        private String category;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
