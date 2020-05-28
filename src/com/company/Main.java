package com.company;

import java.util.Scanner;

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

        Cell phoneLocation = SetPhoneLocation(columns, rows);
        System.out.println(phoneLocation.getX() + " " + phoneLocation.getY());
        boolean pass;
        pass = testPhoneLocationInMap(columns, rows);
        if( pass ==true)
            System.out.println("passed");
        else
            System.out.println("failed");
        //System.out.println(getDistance(board[0][0],board[1][1]));
        //System.out.println("Hello world");
        //setUserChoice();

    }

    public static double getDistance ( Cell phone, Cell Clicked){
        double distance = 0;
        distance = Math.sqrt(((Clicked.getX()-phone.getX())*(Clicked.getX()-phone.getX()))+((Clicked.getY()-phone.getY())*(Clicked.getY()-phone.getY())));
        return distance;
    }

    public static UserChoice setUserChoice(){
        UserChoice userChoice = new UserChoice();
        double x= 0.0;
        double y= 0.0;
        Scanner myObj = new Scanner(System.in);

        System.out.println("What is the x cordinate");
        x = myObj.nextDouble();
        userChoice.setX(x);
        System.out.println("What is the Y cordinate");
        y = myObj.nextDouble();
        userChoice.setY(y);
        System.out.println("x: "+ userChoice.getX() + " " + "y: "+ userChoice.getY());
        return userChoice;
    }

    public static Cell SetPhoneLocation(int col, int row){
        Cell cell = new Cell();
        cell.setY( (int) (Math.random() * col - 1));
        cell.setX( (int) (Math.random() * row - 1));
        return cell;
    }

    public static boolean testPhoneLocationInMap(int col, int rows){
        Cell cell = new Cell();
        for (int x=0; x<1000000; x++){
            cell= SetPhoneLocation(col, rows);
            if (cell.getY()<0 || cell.getY()>col){
                return false;
            }
            else if(cell.getX()<0 || cell.getX()>rows){
                return false;
            }
        }
        return true;
    }x

}
