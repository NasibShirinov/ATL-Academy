package lesson31;

public class RunnableApp {

    public static void main(String[] args) {
        new MyRunnable("Anar").run();
    }

    public static class MyRunnable implements Runnable {
        private String parameterName;

        public MyRunnable(String name) {
            parameterName = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Runnable name: " + parameterName);
            }
        }
    }
}
