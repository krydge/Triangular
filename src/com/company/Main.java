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
                board[i][j].setX(i);
                board[i][j].setY(j);
            }
        }
        for( int i = 0 ; i <rows; i++){
            for( int j = 0; j <columns; j++){
                System.out.print(board[i][j].getSymbol() +"  ");
            }
            System.out.println();
        }
        System.out.println(getDistance(board[0][0],board[1][1]));
        System.out.println("Hello world");

    }

    public static double getDistance ( Cell phone, Cell Clicked){
        double distance = 0;
        distance = Math.sqrt(((Clicked.getX()-phone.getX())*(Clicked.getX()-phone.getX()))+((Clicked.getY()-phone.getY())*(Clicked.getY()-phone.getY())));
        return distance;
    }


}
