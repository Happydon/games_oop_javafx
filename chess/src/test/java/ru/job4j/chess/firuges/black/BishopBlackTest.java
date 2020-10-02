package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position().toString(), is("C1"));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.copy(Cell.G5).position().toString(), is("G5"));
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(Arrays.toString(bishopBlack.way(Cell.C1, Cell.G5)), is("[D2, E3, F4, G5]"));
    }

    @Test
    public void way2() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C3);
        assertThat(Arrays.toString(bishopBlack.way(Cell.C3, Cell.A1)), is("[B2, A1]"));
    }

    @Test
    public void isDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertEquals((bishopBlack.isDiagonal(Cell.C1, Cell.G5)), true);
    }

    @Test
    public void isDiagonal2() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertEquals((bishopBlack.isDiagonal(Cell.C1, Cell.G8)), false);
    }
}