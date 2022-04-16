package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void positionA1() {
        Figure bb = new BishopBlack(A1);
        assertEquals(bb.position(), A1);
    }

    @Test
    public void copyA1ToA2() {
        Figure bb = new BishopBlack(A1);
        bb = bb.copy(A2);
        assertEquals(bb.position(), A2);
    }

    @Test
    public void wayC1ToG5() {
        Figure bb = new BishopBlack(C1);
        Cell[] cell = bb.way(G5);
        assertArrayEquals(cell, new Cell[]{D2, E3, F4, G5});
    }

    @Test
    public void isDiagonalB2ToA3() {
        BishopBlack bb = new BishopBlack(B2);
        assertTrue(bb.isDiagonal(B2, A3));
    }

    @Test
    public void isNotDiagonalB2ToA2() {
        BishopBlack bb = new BishopBlack(B2);
        assertFalse(bb.isDiagonal(B2, A2));
    }
}