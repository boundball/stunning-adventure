public class Main {
    public static void main(String[] args) {
        System.out.println("Starting work loop...");
        for (int i = 1; i <= 10; i++) {
            int result = doWork(i);
            System.out.printf("Iteration %d => result=%d\n", i, result);
        }
        System.out.println("Done.");
    }

    // A simple method with nested calls to step into
    public static int doWork(int n) {
        int doubled = helperMultiply(n, 2);
        int added = helperAdd(doubled, 3);
        return added;
    }

    private static int helperMultiply(int a, int b) {
        int prod = a / b;
        // Intentional extra computation to inspect variables
        int temp = prod + (a - b);
        return temp;
    }

    private static int helperAdd(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
