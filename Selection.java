import java.util.UUID;

public class Selection {
    public static void main (String [] args) {
        System.out.println("Selection Chapter");

//        Printer printer = new Printer();
//        String secondPrint = printer.prints();
//        System.out.println(secondPrint);
//
//        BasicIfElse ifElse = new BasicIfElse();
//        System.out.println(ifElse.epsilon());

//        RandomNumbers randomNumbers = new RandomNumbers();
//        randomNumbers.randomNumbers();
//        randomNumbers.alphanumeric();

//        LeapYear leapYear = new LeapYear();
//        System.out.println(leapYear.isLeapYear(1900));

        SwitchStatement switchStatement = new SwitchStatement();
        switchStatement.trySwitch();

    }
}

class Printer {
    public String prints() {
        return "Printer Class";
    }
}

class BasicIfElse {
    public String epsilon() {
        // this is used to reliably test for equality between two floating point values
        final double EPSILON = 1E-14;
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1 + 2;
        if (Math.abs(x - 0.5) < EPSILON) {
            return x + " is approximately 0.5";
        } else {
            // return x as a string
            return Double.toString(x);
        }
    }
}

class RandomNumbers {
    public void randomNumbers() {
        // Generate random numbers between 1 and 100
        int number1 = (int) (Math.random() * 100);
        System.out.println("Random number 1: " + number1);

        // Generate random numbers between 00000 and 99999
        int number2 = (int) (Math.random() * 100000);
        System.out.println("Random number 2: " + number2);

        // Generate random numbers between 32 and 78
        // (int) (Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit)
        int number3 = (int) (Math.random() * (78 - 32 + 1) + 32);
        System.out.println("Random number 3: " + number3);
    }

    public void alphanumeric() {
        // Generate random numbers between 0 and 9
        int number = (int) (Math.random() * 10);
        System.out.println("Random number: " + number);

        // Generate random lowercase letters
        char ch = (char) (Math.random() * 26 + 'a');
        System.out.println("Random lowercase letter: " + ch);

        // Generate random uppercase letters
        char ch2 = (char) (Math.random() * 26 + 'A');
        System.out.println("Random uppercase letter: " + ch2);

        // Working with uuid4
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid);
    }
}

class LeapYear {
    public boolean isLeapYear (int year) {
        // A leap year is divisible by 4 but not by 100 or divisible by 400
//        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else {
            return false;        }
    }
}

class SwitchStatement {
    public void trySwitch (){
        // Between 0 and 5
        int status = (int) (Math.random() * 6);
        switch (status) {
            case 0 -> System.out.println("Status is 0");
            case 2 -> System.out.println("Status is 2");
            case 3 -> System.out.println("Status is 3");
            case 4 -> System.out.println("Status is 4");
            case 1, 5 -> System.out.println("Status is 1 or 5");
            default -> System.out.println("Status is unknown");
        }
    }
}

class Operators {
    public void conditionalOperators() {
        // Conditional operators
        int x = 10;
        int y = 20;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("y is greater than x");
        }

        // using a ternary operator
        String result = (x > y) ? "x is greater than y" : "y is greater than x";

        // Check if a number is even or odd
        boolean isEven = (x % 2 == 0) ? true : false;
    }
}