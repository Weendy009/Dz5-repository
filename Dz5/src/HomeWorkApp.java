import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(verificationNumber(7, 7));
        numberCheck(-9);
        System.out.println(numberCheckV2(58));
        print("Matvey", 3);
        System.out.println(leapYear(2020));
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        Random random = new Random();
        int valueOne = random.nextInt();
        int valueTwo = random.nextInt();

        if (valueOne + valueTwo >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public static void printColor() {
        Random random = new Random();
        int value = random.nextInt();

        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    public static void compareNumbers() {
        Random random = new Random();
        int valueOne = random.nextInt();
        int valueTwo = random.nextInt();

        if (valueOne >= valueTwo) {
            System.out.println("valueOne >= valueTwo");
        } else {
            System.out.println("valueOne < valueTwo");
        }
    }

    public static boolean verificationNumber(int valueOne, int valueTwo) {
        int sum = valueOne + valueTwo;
        return sum > 10 && sum <= 20;
    }

    public static void numberCheck(int value) {
        if (value >= 0) {
            System.out.println("число додатнє");
        } else {
            System.out.println("число від’ємне");
        }
    }

    public static boolean numberCheckV2(int value) {
        return value < 0;
    }

    public static void print(String input, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(input);
        }
    }

    public static boolean leapYear(int year) {
        return year % 4 == 0;
    }

}