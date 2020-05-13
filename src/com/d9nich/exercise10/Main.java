package com.d9nich.exercise10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ComplexMatrix complexMatrix = new ComplexMatrix();
        Complex[][] matrix1 = generateMatrix();
        Complex[][] matrix2 = generateMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(
                matrix1, matrix2, complexMatrix.addMatrix(matrix1, matrix2), '+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(
                matrix1, matrix2, complexMatrix.multiplyMatrix(matrix1, matrix2), '*');
    }

    private static Complex[][] generateMatrix() {
        Complex[][] complex = new Complex[3][3];
        Random random = new Random();
        for (int i = 0; i < complex.length; i++) {
            for (int j = 0; j < complex[i].length; j++) {
                complex[i][j] = new Complex(random.nextInt(10), random.nextInt(10));
            }
        }
        return complex;
    }
}
