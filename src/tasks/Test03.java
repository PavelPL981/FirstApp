package tasks;

public class Test03 {

    public static void main(String[] args) {
        testWhenA10B0C0X2Then40();
        testWhenA1B1C1X1Then3();
        testWhenA0B1C1X1Then2();
        testWhenA1B1C0X1Then2();
        testWhenA1B1C1X0Then1();
    }

    static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    static void testWhenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int result = calc(a, b, c, x);
        int expected = 40;
        boolean success = expected == result;
        System.out.println("Test passed : " + success);
    }

    static void testWhenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int result = calc(a, b, c, x);
        int expected = 3;
        boolean success = expected == result;
        System.out.println("Test passed : " + success);
    }

    static void testWhenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int result = calc(a, b, c, x);
        int expected = 2;
        boolean success = expected == result;
        System.out.println("Test passed : " + success);
    }

    static void testWhenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int result = calc(a, b, c, x);
        int expected = 2;
        boolean success = expected == result;
        System.out.println("Test passed : " + success);
    }

    static void testWhenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int result = calc(a, b, c, x);
        int expected = 1;
        boolean success = expected == result;
        System.out.println("Test passed : " + success);
    }
}
