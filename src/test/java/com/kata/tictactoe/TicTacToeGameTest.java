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
        assertEquals('X', ticTacToeGame.getTokenAtPosition(0, 0));
    }

    @Test
    public void shouldAssignOWhenSecondMoveIsPlayed(){
        ticTacToeGame.markTokenAt(0,0);
        ticTacToeGame.markTokenAt(0,1);
        assertEquals('O', ticTacToeGame.getTokenAtPosition(0,1));
    }

    @Test
    public void shouldAssignXWhenThirdMoveIsPlayed(){
        ticTacToeGame.markTokenAt(0,0);
        ticTacToeGame.markTokenAt(0,1);
        ticTacToeGame.markTokenAt(0,2);
        assertEquals('X', ticTacToeGame.getTokenAtPosition(0,2));
    }
}