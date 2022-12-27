import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] bookKeepingArray = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < bookKeepingArray.length; i++) {
            sum = sum + bookKeepingArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] bookKeepingArray = generateRandomArray();
        int min = bookKeepingArray[0];
        int max = bookKeepingArray[0];
        for (int i = 1; i < bookKeepingArray.length; i++) {
            if(bookKeepingArray[i] < min) {
                min = bookKeepingArray[i];
            }
            if(bookKeepingArray[i] > max) {
                max = bookKeepingArray[i];
            }
        }
        System.out.print("Минимальная сумма трат за день составила " + min + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] bookKeepingArray = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < bookKeepingArray.length; i++) {
            sum = sum + bookKeepingArray[i];
        }
        double averageSum = sum / bookKeepingArray.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", averageSum);
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}