package lesson31;

import javax.swing.table.TableStringConverter;

public class MyThreadApp {
        public static void main(String[] args) {
            MyThread myThread = new MyThread("2");

            System.out.println();
            new MyThread("Anar").start();
            new MyThread("Malik").start();
            new MyThread("Kamil").start();

//            new MyThread('1').run();
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
