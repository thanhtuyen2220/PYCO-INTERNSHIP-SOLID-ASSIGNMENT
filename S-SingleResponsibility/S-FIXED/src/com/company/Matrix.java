package com.company;

public class Matrix {
    private int row;
    private int col;
    private int[][] elements;

    Matrix(){
        row=0;
        col=0;
    }
    Matrix(int row, int col){
        this.row=row;
        this.col=col;
        elements = new int[row][col];
    }
    public int getNoRows(){
        return row;
    }
    public int getNoColumns() {
        return col;
    }
    public double getElement(int rows, int cols){
        return elements[rows][cols];
    }
    public void setElement(int rows,int cols,int value){
        elements[rows][cols]=value;
    }

    public Matrix Add2Matrix(Matrix matrix1){
        Matrix result = new Matrix(row,col);
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

}
