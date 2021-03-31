package com.company;

import java.util.Scanner;

public class ClientView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0 ; int col= 0;
        int row2 = 0 ;int col2 = 0;
        System.out.println("Enter your row: ");
        row = sc.nextInt();
        System.out.println("Enter your column: ");
        col = sc.nextInt();
        System.out.println("Enter your row: ");
        row2 = sc.nextInt();
        System.out.println("Enter your column: ");
        col2 = sc.nextInt();
        Matrix matrix1 = new Matrix(row,col);
        Matrix matrix2 = new Matrix(row2,col2);
        //Matrix res = new Matrix();
        MatrixManipulations.initMatrix(matrix1);
        MatrixManipulations.initMatrix(matrix2);
        Matrix res = matrix1.Add2Matrix(matrix2);
        MatrixManipulations.PrintMatrix(res);

        /*MatrixManipulations matrix1 = new MatrixManipulations();
        MatrixManipulations matrix2 = new MatrixManipulations();
        matrix1.initMatrix();
        matrix2.initMatrix();
        matrix1.Add2Matrix(matrix2);*/





    }
}
