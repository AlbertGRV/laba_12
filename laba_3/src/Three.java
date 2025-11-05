import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четное число N: ");
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Ошибка: N должно быть четным!");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Исходный массив:");
        printArray(arr);


        int polovina = n / 2;
        for (int i = 0; i < polovina; i++) {
            int temp = arr[i];
            arr[i] = arr[polovina + i];
            arr[polovina + i] = temp;
        }

        System.out.println("Массив после обмена половин:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}