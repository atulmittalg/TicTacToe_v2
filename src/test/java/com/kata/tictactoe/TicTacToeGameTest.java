package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TicTacToeGameTest {

    private TicTacToeGame ticTacToeGame;

    @Before
    public void initializeTicTacToeGameObject(){
        ticTacToeGame = new TicTacToeGame();
    }
    @Test
    public void shouldCreateTicTacToeGameObject(){
        assertNotNull(ticTacToeGame);
    }

    @Test
    public void shouldAssignXWhenFirstMoveIsPlayed(){
        assertEquals('X', ticTacToeGame.getTokenAtPosition());
    }
}