package com.company;

import java.util.Scanner;

public class MatrixManipulations extends Matrix {


    Matrix matrix;

    public static void initMatrix(Matrix matrix){
        //matrix = new Matrix();
        Scanner sc = new Scanner(System.in);
        int col= matrix.getNoColumns();
        int row = matrix.getNoRows();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter your elements: ");
                matrix.setElement(i,j,sc.nextInt()) ;
            }
        }
        //return matrix;
    }
    public static void PrintMatrix(Matrix matrix){
        int col= matrix.getNoColumns();
        int row = matrix.getNoRows();
        System.out.println("Your result matrix:");
        for(int i = 0 ; i<row;i++){
            for(int j= 0 ; j< col;j++){
                System.out.println(matrix.getElement(i,j));
            }
        }
    }


}
