import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n == 0) {
            System.out.println("Массив пуст.");
            return;
        }

        int lastDigit = Math.abs(arr[0]) % 10;
        System.out.println("Последняя цифра первого элемента: " + lastDigit);
        System.out.println("Порядковые номера элементов, содержащих эту цифру ровно 2 раза:");

        boolean found = false;
        for (int i = 0; i < n; i++) {
            int count = sovpad(Math.abs(arr[i]), lastDigit);
            if (count == 2) {
                System.out.print((i + 1) + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Таких элементов нет.");
        } else {
            System.out.println();
        }
    }


    public static int sovpad(int num, int digit) {
        if (num == 0 && digit == 0) return 1;
        int count = 0;
        while (num > 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}