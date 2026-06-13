package tasks;

public class Test02 {

    static String checkNumber(int number) {
        String result;
        if (number % 3 == 0 && number % 2 == 0) {
                result = "The number divides by 6.";
        } else if (number % 3 == 0) {
                result = "The number divides by 3, but it isn't the even number.";
        } else if (number % 2 == 0) {
                result = "The number doesn't divide by 3, but it is the even number.";
        } else {
                result = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(18));  // Output: The number divides by 6.
        System.out.println(checkNumber(9));   // Output: The number divides by 3, but it isn't the even number.
        System.out.println(checkNumber(8));   // Output: The number doesn't divide by 3, but it is the even number.
        System.out.println(checkNumber(7));   // Output: The number doesn't divide by 3 and it isn't the even number.
        System.out.println(checkNumber(6));   // Output: The number divides by 6.
        System.out.println(checkNumber(3));   // Output: The number divides by 3, but it isn't the even number.
        System.out.println(checkNumber(2));   // Output: The number doesn't divide by 3, but it is the even number.
        System.out.println(checkNumber(1));   // Output: The number doesn't divide by 3 and it isn't the even number.
        System.out.println(checkNumber(0));   // Output: The number divides by 6.
        System.out.println(checkNumber(-6));  // Output: The number divides by 6.
        System.out.println(checkNumber(-9));  // Output: The number divides by 3, but it isn't the even number.
        System.out.println(checkNumber(-10)); // Output: The number doesn't divide by 3, but it is the even number.
    }
}
