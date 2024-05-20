package lesson31;

public class AnonymousApp {
    public static void main(String[] args) {
//        Thread myAnonymousClass = new MyThread();
    }

    public static class MyThread extends Thread {
        public MyThread (String name) {
            super (name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread name" + Thread.currentThread().getName());
            }
        }
    }
}
