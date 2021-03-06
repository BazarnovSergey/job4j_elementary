package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float dollar = Converter.rubleToDollar(420);
        System.out.println("420 rubles are " + dollar + " dollar.");

        float in1 = 420;
        float expected1 = 7;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("420 rubles are 7. Test result : " + passed1);
    }
}
