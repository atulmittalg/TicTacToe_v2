package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameboardLayout = new char[3][3];
    private char currentTokenToPlay = 'X';

    public char getTokenAtPosition(final int positionX, final int positionY) {
        if(gameboardLayout[positionX][positionY] == 'O'){return 'O';}
        return 'X';
    }

    public void markTokenAt(final int positionX, final int positionY) {
        gameboardLayout[positionX][positionY] = currentTokenToPlay;
        if(currentTokenToPlay == 'X'){currentTokenToPlay = 'O';}
        else {currentTokenToPlay = 'X';}
    }
}