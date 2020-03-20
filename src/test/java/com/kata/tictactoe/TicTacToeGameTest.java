package com.kata.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TicTacToeGameTest {
    @Test
    public void shouldCreateTicTacToeGameObject(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertNotNull(ticTacToeGame);
    }

    @Test
    public void shouldAssignXWhenFirstMoveIsPlayed(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertEquals('X', ticTacToeGame.getTokenAtPosition());
    }
}