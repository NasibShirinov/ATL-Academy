package lesson32;

import java.util.function.BiFunction;

public class FunctionalApp {
    public static void main(String[] args) {

        @FunctionalInterface
        interface BiFunction<T, U, R> {
            R apply(T t, U u);
        }

        BiFunction<Integer, Integer, Integer> addFunction = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };

    }


}
