package com.company;

import java.util.Scanner;

public class ClientView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixCalculator matrix1 = new MatrixCalculator(2,2);
        MatrixCalculator matrix2 = new MatrixCalculator(2,2);
        matrix1.initMatrix();
        matrix2.initMatrix();
        MatrixCalculator res = matrix1.Add2Matrix(matrix2);
        res.PrintMatrix();
    }
}
