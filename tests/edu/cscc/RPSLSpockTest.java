package edu.cscc;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class RPSLSpockTest {
    private RPSLSpock game;
@Before
    public void pretests() {
        game = new RPSLSpock();
    }

    @Test
    public void isValidPick() {

        assertTrue(game.isValidPick("rock"));
        assertTrue(game.isValidPick("paper"));
        assertTrue(game.isValidPick("scissors"));
        assertTrue(game.isValidPick("lizard"));
        assertTrue(game.isValidPick("spock"));
        assertFalse(game.isValidPick("cup"));
    }

    @Test(timeout=1000000)
    public void generatePick() {

        assertTrue(game.isValidPick(game.generatePick()));
    }

    @Test
    public void isComputerWin() {
        assertTrue(game.isComputerWin("rock","scissors"));
        assertTrue(game.isComputerWin("rock","lizard"));
        assertTrue(game.isComputerWin("paper","rock"));
        assertTrue(game.isComputerWin("paper","spock"));
        assertTrue(game.isComputerWin("scissors","paper"));
        assertTrue(game.isComputerWin("scissors","lizard"));
        assertTrue(game.isComputerWin("lizard","paper"));
        assertTrue(game.isComputerWin("lizard","spock"));
        assertTrue(game.isComputerWin("spock","rock"));
        assertTrue(game.isComputerWin("spock","scissors"));
        assertFalse(game.isComputerWin("paper","scissors"));


    }
}