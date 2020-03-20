package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameboardLayout = new char[3][3];
    private char currentTokenToPlay = 'X';

    public char getTokenAtPosition(final int positionX, final int positionY) {
        return gameboardLayout[positionX][positionY];
    }

    public void markTokenAt(final int positionX, final int positionY) {
        if (gameboardLayout[positionX][positionY] != 0) {throw new RuntimeException("Position Already Filled");}
        gameboardLayout[positionX][positionY] = currentTokenToPlay;
        changeCurrentPlayerTokenForNextTurn();
    }

    private void changeCurrentPlayerTokenForNextTurn() {
        currentTokenToPlay = currentTokenToPlay == 'X' ? 'O' : 'X';
    }
}