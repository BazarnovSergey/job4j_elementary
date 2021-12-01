package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        int index = 1;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                count++;
            }
        }
        int n = (int) Math.ceil(Math.sqrt(count));
        int[][] temp = new int[n][n];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (index <= count) {
                    temp[i][j] = index++;
                } else {
                    temp[i][j] = 0;
                }
            }
        }
        return temp;
    }
}
