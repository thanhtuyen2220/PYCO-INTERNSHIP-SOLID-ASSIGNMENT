package com.company;

import java.util.Scanner;

class MatrixCalculator {
    Scanner sc = new Scanner(System.in);
    private int row;
    private int col;
    private double[][] elements;

    MatrixCalculator(){
        row=0;
        col=0;
    }
    MatrixCalculator(int row, int col){
        this.row=row;
        this.col=col;
        elements = new double[row][col];
    }
    public double getElement(int rows,int cols){
        return elements[rows][cols];
    }
    public void setElement(int rows,int cols,double value){
        elements[rows][cols]=value;
    }
    public int getNoRows(){
        return row;
    }
    public int getNoColumns() {
        return col;
    }

    public void initMatrix(){
        MatrixCalculator matrix = new MatrixCalculator();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter your elements: ");
                elements[i][j] = sc.nextInt();
            }
        }
    }

    public MatrixCalculator Add2Matrix(MatrixCalculator matrix1){
        MatrixCalculator result = new MatrixCalculator(row,col);
        if(this.row !=matrix1.row || this.col!=matrix1.col){
            System.out.println("Error");
        }
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    result.elements[i][j] = this.elements[i][j]+ matrix1.elements[i][j];
                }
            }
        }
        return result;

    }


    public void PrintMatrix(){
        System.out.println("Your result matrix:");
        for(int i = 0 ; i<row;i++){
            for(int j= 0 ; j< col;j++){
                System.out.println(elements[i][j]);
            }
        }
    }


}
