package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameboardLayout = new char[3][3];

    public char getTokenAtPosition(int positionX, int positionY) {
        if(gameboardLayout[positionX][positionY] == 'O'){return 'O';}
        return 'X';
    }

    public void markTokenAt(int positionX, int positionY) {
        gameboardLayout[positionX][positionY] = 'O';
    }
}