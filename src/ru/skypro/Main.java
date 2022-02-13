package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] test = new int[3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;

        float[] test2 = {1.57f, 7.654f, 9.986f};
        System.out.println("\n");
        double[] random = new double[4];
        random[0] = 90000;
        random[1] = 2.77;
        random[2] = 3.996589;
        random[3] = 7.785963214598;

        for (int i = 0; i < test.length; i++) {
            if (i == test.length - 1) {
                System.out.println(test[i]);
            } else {
                System.out.print(test[i] + ",");
            }
        }
        for (int i = 0; i < test2.length; i++) {
            if (i == test2.length - 1) {
                System.out.println(test2[i]);
            } else {
                System.out.print(test2[i] + ",");
            }
        }
        for (int i = 0; i < random.length; i++) {
            if (i == random.length - 1) {
                System.out.println(random[i]);
            } else {
                System.out.print(random[i] + ", ");
            }
        }
       for (int i = random.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(random[i] + ", ");
            } else {
                System.out.print(random[i]);
            }
        }
        System.out.print("\n");
       for (int i = test.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(test[i] + ", ");
            } else {
                System.out.print(test[i]);
            }
        }
        System.out.print("\n");
        for (int i = test2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(test2[i] + ", ");
            } else {
                System.out.print(test2[i]);
            }
        }
    }
}