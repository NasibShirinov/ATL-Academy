package lesson17;

import javax.security.auth.Subject;

public class test {
    public class Test {
        public static void main(String[] args) {
            Subclass s1 = new Subclass();
            s1.foo();
            Super s = new Subclass();

        }

//        public static void main(String[] args) {
//
//        }
    }
}

class Super {
    private void foo() {
        System.out.println("Super");
    }
}

final class Subclass extends Super {
    public void foo () {
        System.out.println("Subclass");
    }
}
