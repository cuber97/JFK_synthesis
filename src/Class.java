public final class Class {
    public static void main(String[] args) {
        int k = 8;
        FOR(j, k, 20, <, +);

        method1();
        method2(15);
    }

    private static void method1() {
        FOR(j, 4, 15, >, +);
    }

    private static void method2(int n) {
        FOR(i, n, 18, <=, +);
        FOR(i, 4, 0, >=, -);
    }
}

