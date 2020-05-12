package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
         int columns = 10 ;
         int rows = 10;

        Cell[][] board = new Cell[rows][columns];

        // build game board
        for( int i = 0 ; i <rows; i++){
            for( int j= 0; j<columns; j++){
                board[i][j] = new Cell();
            }
        }
        for( int i = 0 ; i <rows; i++){
            for( int j = 0; j <columns; j++){
                System.out.print(board[i][j].getSymbol() +"  ");
            }
            System.out.println();
        }

        System.out.println("Hello world");

    }


}
