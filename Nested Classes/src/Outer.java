public class Outer {
    private String message = "Hello from Outer class";

    // Non-static nested class (Inner class)
    public class Inner {
        public void display() {
            System.out.println("Inner says: " + message);
        }
    }

    public void showMessage() {
        String localMessage = "Hello from local class";

        // Local class inside a method
        class Local {
            public void print() {
                System.out.println(localMessage);
            }
        }

        Local local = new Local();
        local.print();
    }
}
