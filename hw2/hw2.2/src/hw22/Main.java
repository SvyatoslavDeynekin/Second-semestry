package hw22;

import java.util.Random;

public class Main {

    public static int[][] columnFirstElementSort(int[][] mas) {
        final int n = 3;
        int temp = 0;
        int temp1 = 0;
        while (temp < n) {
            int min_j = 0;
            int min = 10;
            for (temp1 = temp; temp1 < n; temp1++) {
                if (mas[0][temp1] < min) {
                    min = mas[0][temp1];
                    min_j = temp1;
                }
            }
            for (int i = 0; i < n; i++) {
                int extra = mas[i][min_j];
                mas[i][min_j] = mas[i][temp];
                mas[i][temp] = extra;
            }
            temp++;
        }

        return mas;
    }

    public static void main(String[] args) {
        final int n = 3;
        int[][] mas = new int[n][n];
        Random random = new Random();

        System.out.println("Random massive:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = random.nextInt(9) + 1;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sort massive:\n");
        int[][] b = columnFirstElementSort(mas);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
