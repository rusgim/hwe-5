package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] test = new int[3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;

        float[] test2 = {1.57f, 7.654f, 9.986f};

        double[] random = new double[4];
        random[0] = 90000;
        random[1] = 2.77;
        random[2] = 3.996589;
        random[3] = 7.785963214598;
        for (int i = 0; i < 4; i++) {
            System.out.println(random[i]);
        }
        System.out.print(test[0] + ", " + test[1] + ", " + test[2]);
        System.out.print("\n" + test2[0] + ", " + test2[1] + ", " + test2[2]);
        System.out.print("\n" + random[0] + ", " + random[1] + ", " + random[2] + ", " + random[3]);
        System.out.println("\n");

        System.out.print(test[2] + ", " + test[1] + ", " + test[0]);
        System.out.println("\n" + test2[2] + ", " + test2[1] + ", " + test2[0]);
        System.out.println(random[3] + ", " + random[2] + ", " + random[1] + ", " + random[0]);
    }
}
