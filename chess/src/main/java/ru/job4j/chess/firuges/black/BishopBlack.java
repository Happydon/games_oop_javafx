package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;


public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (!isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not move by diagonal to %s",  dest)
            );
        }
        int size = Math.abs(dest.getX() - source.getX());
        Cell[] steps = new Cell[size];
        int deltaX = dest.getX() > source.getX()? 1: -1;
        int deltaY = dest.getY() > source.getY()? 1: -1;
        for (int index = 0; index < size; index++) {
            steps[index] = Cell.findBy(source.getX() + (index + 1) * deltaX ,+ source.getY() + (index + 1) * deltaY );
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(dest.getX() - source.getX()) == Math.abs(dest.getY() - source.getY());
    }
    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}