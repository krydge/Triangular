package com.company;

import java.util.Scanner;
import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        //***************************************Board Demensions*******************************************//
         int columns = 10 ;
         int rows = 10;
         UserChoice userChoice = new UserChoice();



         //**************************************Game board Set up*******************************************//
        Cell[][] board = new Cell[rows][columns];

        // build game board
        /*
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
        }*/

        BuildBoard(board, rows, columns);
        System.out.println("Board is built");


        //************************************************Set phone locaton********************************//
        Cell phoneLocation = SetPhoneLocation(columns, rows);
        board[(int) phoneLocation.getX()][(int) phoneLocation.getY()].setPhone(true);
        board[(int) phoneLocation.getX()][(int) phoneLocation.getY()].setSymbol('*');
        PrintBoard(board,rows,columns);
        System.out.println("Phone location is set.");
        //System.out.println(board[(int) phoneLocation.getX()][(int) phoneLocation.getY()].isPhone());
        /*
        for( int i = 0 ; i <rows; i++){
            for( int j = 0; j <columns; j++){
                System.out.print(board[i][j].getSymbol() +"  ");
            }
            System.out.println();
        }
        System.out.println(phoneLocation.getX() + " " + phoneLocation.getY());
        userChoice = setUserChoice();
        System.out.println(userChoice.getX() +" "+ userChoice.getY());
        System.out.println(IsChoicePhoneLocation(userChoice, phoneLocation));
        */

        //****************************************Tests****************************************************//
       // boolean pass;
       // pass = testPhoneLocationInMap(columns, rows);
      //  if( pass ==true)
       //     System.out.println("passed");
       // else
      //      System.out.println("failed");
        //System.out.println(getDistance(board[0][0],board[1][1]));
        //System.out.println("Hello world");
        //setUserChoice();

    }


    //***************************************Distance Formula*************************************************//
    public static double getDistance ( Cell phone, Cell Clicked){
        double distance = 0;
        distance = Math.sqrt(((Clicked.getX()-phone.getX())*(Clicked.getX()-phone.getX()))+((Clicked.getY()-phone.getY())*(Clicked.getY()-phone.getY())));
        return distance;
    }


    //************************************************Get User Choice******************************************//
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


    //*************************************Get Randome phone starting location******************************//
    public static Cell SetPhoneLocation(int col, int row){
        Cell cell = new Cell();
        cell.setY( (int) (Math.random() * col - 1));
        cell.setX( (int) (Math.random() * row - 1));
        return cell;
    }


    //*************************************Check if user choice is phone location******************************//
    public static boolean IsChoicePhoneLocation (UserChoice userChoice, Cell phone){
        boolean b = false;
        if (userChoice.getX()==phone.getX() && userChoice.getY()== phone.getY()){
            b = true;
        }
            return b;
    }

    //**************************************Set Timer********************************************************//2
    public  static Timer setTimer(int time){
        Timer timer = new Timer();
        
        return timer;
    }
    //*****************************************Test Functions*************************************************//
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
    }

    public static boolean tetsPhonelocationisUserchoice(UserChoice userChoice, Cell phone){
        boolean pass = false;

        return true;
    }
    public static void BuildBoard(Cell[][] board, int rows, int col){
        for( int i = 0 ; i <rows; i++){
            for( int j= 0; j<col; j++){
                board[i][j] = new Cell();
                board[i][j].setX(i);
                board[i][j].setY(j);
            }
        }
        PrintBoard(board, rows, col);
    }

    public static void PrintBoard(Cell[][] board, int rows, int col){
        for( int i = 0 ; i <rows; i++){
            for( int j = 0; j <col; j++){
                System.out.print(board[i][j].getSymbol() +"  ");
            }
            System.out.println();
        }
    }

    public static boolean GameLoop(Cell[][] board, int rows, int col, Cell phoneLocation){

        return false;
    }
}
