package hw21;

import java.util.Random;

public class Main {

    boolean[] mass = new boolean[25];

    public static int[] helixSort(int[][] array) {
        int k = 0;
        int[] array1 = new int[array.length * array.length];
        int length = 0;
        int first = array.length / 2;
        int second = array.length / 2;
        int tool = 1;

        do {
            for (int i = 0; i <= length; i++) {
                array1[k] = array[first][second];
                k++;
                first = first + tool;
            }
            if (length == array.length - 1) {
                break;
            }

            for (int i = 0; i <= length; i++) {
                array1[k] = array[first][second];
                k++;
                second = second - tool;
            }

            tool = -tool;
            length++;
        } while (length != array.length);

        return array1;
    }

    public static void main(String[] args) {
        final int n = 5;
        int[][] massive = new int[n][n];
        Random random = new Random();

        System.out.print("Рандомно сгенерированный массив:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                massive[i][j] = random.nextInt(100);
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Отсортированный массив:\n");
        int[] massive1 = helixSort(massive);
        for (int i = 0; i < massive1.length; i++) {
            System.out.print(massive1[i] + " ");
        }
    }
}
