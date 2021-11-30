package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int index = 0;
        int n = (int) Math.sqrt(array.length) + 1;
        int[][] massive = new int[n][n];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++, index++) {
                if (index < array.length) {
                    massive[i][j] = array[index];
                } else {
                    massive[i][j] = 0;
                }
            }
        }
        return massive;
    }
}
