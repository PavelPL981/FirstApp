package tasks;

public class IdealWeight {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return (double) Math.round(result * 100) / 100;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return (double) Math.round(result * 100) / 100;
    }

    public static void testWhenHeightMan187Then100() {
        short height = 187;
        double result = manWeight(height);
        double expected = 100.05;
        double precision = 0.01;
        boolean success = Math.abs(result - expected) <= precision;
        System.out.println("Test passed: " + success);
    }

    public static void testWhenHeightMan175Then86() {
        short height = 175;
        double result = manWeight(height);
        double expected = 86.25;
        double precision = 0.01;
        boolean success = Math.abs(result - expected) <= precision;
        System.out.println("Test passed: " + success);
    }

    public static void testWhenHeightMan190Then103() {
        short height = 190;
        double result = manWeight(height);
        double expected = 103.5;
        double precision = 0.01;
        boolean success = Math.abs(result - expected) <= precision;
        System.out.println("Test passed: " + success);
    }

    public static void testWhenHeightWoman160Then57() {
        short height = 160;
        double result = womanWeight(height);
        double expected = 57.50;
        double precision = 0.01;
        boolean success = Math.abs(result - expected) <= precision;
        System.out.println("Test passed: " + success);
    }

    public static void testWhenHeightWoman170Then69() {
        short height = 170;
        double result = womanWeight(height);
        double expected = 69.00;
        double precision = 0.01;
        boolean success = Math.abs(result - expected) <= precision;
        System.out.println("Test passed: " + success);
    }

    public static void main(String[] args) {
        testWhenHeightMan187Then100();
        testWhenHeightMan175Then86();
        testWhenHeightMan190Then103();

        testWhenHeightWoman160Then57();
        testWhenHeightWoman170Then69();
    }
}
