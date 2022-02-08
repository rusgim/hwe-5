package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] test = new int[3];
        System.out.println(test[0]);
        System.out.println(test[1]);
        System.out.println(test[2]);

        float[] test2 = {1.57f, 7.654f, 9.986f};

        double[] random = new double[4];
        random[0] = 90000;
        random[1] = 2.77;
        random[2] = 3.996589;
        random[3] = 7.785963214598;
        for (int i = 0; i < 4; i++) {
            System.out.println(random[i]);
        }
    }
}
