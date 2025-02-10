import java.util.Scanner;

public class ElementaryProgramming {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");

        Scanner input = new Scanner(System.in);

        // Call the computeCircleArea method
//        computeCircleArea();

        // Call the isPalindrome method
//        String word = "madam";
//        System.out.println(isPalindrome(word));

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheitTemp = input.nextDouble();
        System.out.println(fahrenheitToCelsius(fahrenheitTemp));
    }

    public static void computeCircleArea() {
        // Calculate the area of a circle (pi * r * r)

        // initialize a constant variable PI
        final double PI = 3.14;

        // create a scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        // Collect the radius from CLI
        double radius = input.nextDouble();

        // Calculate area
        double area = PI * radius * radius;
        System.out.println("Area of a circle with radius " + radius + " is " + area);
    }

    public static boolean isPalindrome(String word) {
        // Using two pointer method determine if a string is a palindrome e.g. madam

        // initialize the left and right pointer
        int left = 0;
        int right = word.length() -1;

        while (left <= right ) {
//          if (Objects.equals(word.charAt(left), word.charAt(right))){
            if (word.charAt(left) == word.charAt(right)) {
//                left += 1;
//                right -= 1;
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static double fahrenheitToCelsius(double fahrenheitTemp) {
        // Convert Fahrenheit temperature values to Celsius
        double celsius = (5.0 / 9) * (fahrenheitTemp - 32);
        return Math.round(celsius * 100) / 100.0;
    }

    public static void almightyFormula() {
        /*
        -b + root(b2 - 4ac)/2a
         */
        double result;
        double a = 0;
        double b = 0;
        double c = 0;

        result = (-b + Math.sqrt((b*b) - 4 * a * c))/2 * a;
        System.out.println("result: " + result);
    }
}
