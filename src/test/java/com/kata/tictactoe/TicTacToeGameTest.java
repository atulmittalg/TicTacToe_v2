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
        ticTacToeGame.markTokenAt(0,0);
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

    @Test(expected = RuntimeException.class)
    public void shouldThrowPositionAlreadyFilledExceptionWhenPlayingAtAUsedPosition(){
        ticTacToeGame.markTokenAt(0,0);
        ticTacToeGame.markTokenAt(0,1);
        ticTacToeGame.markTokenAt(0,2);
        ticTacToeGame.markTokenAt(0,2);
    }

    @Test
    public void shouldAssignXWhenNinthMoveIsPlayed(){
        ticTacToeGame.markTokenAt(0,0);
        ticTacToeGame.markTokenAt(0,1);
        ticTacToeGame.markTokenAt(0,2);
        ticTacToeGame.markTokenAt(1,0);
        ticTacToeGame.markTokenAt(1,1);
        ticTacToeGame.markTokenAt(1,2);
        ticTacToeGame.markTokenAt(2,0);
        ticTacToeGame.markTokenAt(2,1);
        ticTacToeGame.markTokenAt(2,2);
        assertEquals('X', ticTacToeGame.getTokenAtPosition(2,2));
    }
}