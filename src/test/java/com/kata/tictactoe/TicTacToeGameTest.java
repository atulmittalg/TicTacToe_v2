package com.kata.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TicTacToeGameTest {
    @Test
    public void shouldCreateTicTacToeGameObject(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertNotNull(ticTacToeGame);
    }
}