package ru.job4j.condition;

public class Point {

        public static double distance(int x1, int y1, int x2, int y2) {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }

        public static void main(String[] args) {
            double result = Point.distance(0, 0, 2, 0);
            System.out.println("result (0, 0) to (2, 0) " + result);

            double result1 = Point.distance(2, 4, 6, 1);
            System.out.println("result (2, 4) to (6, 1) " + result1);

            double result2 = Point.distance(2, 3, 8, 7);
            System.out.println("result (2, 3) to (8, 7) " + result2);

            double result3 = Point.distance(4, 7, 5, 2);
            System.out.println("result (4, 7) to (5, 2) " + result3);

        }
    }
