package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameBoardLayout = new char[3][3];
    private char currentTokenToPlay = 'X';

    public char getTokenAtPosition(final int positionX, final int positionY) {
        return gameBoardLayout[positionX][positionY];
    }

    public void markTokenAt(final int positionX, final int positionY) {
        if (gameBoardLayout[positionX][positionY] != 0) {throw new RuntimeException("Position Already Filled");}
        gameBoardLayout[positionX][positionY] = currentTokenToPlay;
        changeCurrentPlayerTokenForNextTurn();
    }

    private void changeCurrentPlayerTokenForNextTurn() {
        currentTokenToPlay = currentTokenToPlay == 'X' ? 'O' : 'X';
    }
}