package ru.job4j.chess;

        import org.junit.Test;
        import ru.job4j.chess.*;
        import ru.job4j.chess.firuges.Figure;
        import ru.job4j.chess.firuges.black.BishopBlack;
        import ru.job4j.chess.firuges.black.PawnBlack;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.*;
        import static ru.job4j.chess.firuges.Cell.*;

public class LogicTest {

    @Test
    public void move() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        BishopBlack bB = new BishopBlack(C8);
        logic.add(bB);
        BishopBlack bBExtra = new BishopBlack(F8);
        logic.add(bBExtra);
        PawnBlack p1 = new PawnBlack(H1);
        logic.add(p1);
        PawnBlack p2 = new PawnBlack(H2);
        logic.add(p2);
        PawnBlack p3 = new PawnBlack(H3);
        logic.add(p3);
        PawnBlack p4 = new PawnBlack(H4);
        logic.add(p4);
        PawnBlack p5 = new PawnBlack(H5);
        logic.add(p5);
        PawnBlack p6 = new PawnBlack(H6);
        logic.add(p6);
        PawnBlack p7 = new PawnBlack(H7);
        logic.add(p7);
        PawnBlack p8 = new PawnBlack(H8);
        logic.add(p8);
        PawnBlack p9 = new PawnBlack(G1);
        logic.add(p9);
        PawnBlack p10 = new PawnBlack(G2);
        logic.add(p10);
        PawnBlack p11 = new PawnBlack(G3);
        logic.add(p11);
        PawnBlack p12 = new PawnBlack(G4);
        logic.add(p12);
        PawnBlack p13 = new PawnBlack(G5);
        logic.add(p13);
        PawnBlack p14 = new PawnBlack(G6);
        logic.add(p14);
        PawnBlack p15 = new PawnBlack(G7);
        logic.add(p15);
        PawnBlack p16 = new PawnBlack(G8);
        logic.add(p16);
        PawnBlack p17 = new PawnBlack(A1);
        logic.add(p17);
        PawnBlack p18 = new PawnBlack(A2);
        logic.add(p18);
        PawnBlack p19 = new PawnBlack(A3);
        logic.add(p19);
        PawnBlack p20 = new PawnBlack(A4);
        logic.add(p20);
        PawnBlack p21 = new PawnBlack(A5);
        logic.add(p21);
        PawnBlack p22 = new PawnBlack(A6);
        logic.add(p22);
        PawnBlack p23 = new PawnBlack(A7);
        logic.add(p23);
        PawnBlack p24 = new PawnBlack(A8);
        logic.add(p24);
        PawnBlack p25 = new PawnBlack(B1);
        logic.add(p25);
        PawnBlack p26 = new PawnBlack(B2);
        logic.add(p26);
        PawnBlack p27 = new PawnBlack(B3);
        logic.add(p27);
        PawnBlack p28 = new PawnBlack(B4);
        logic.add(p28);
        PawnBlack p29 = new PawnBlack(B5);
        logic.add(p29);
        PawnBlack p30 = new PawnBlack(B6);
        logic.add(p30);
        logic.move(C8, E6);
        assertThat(logic.findBy(E6), is(0));
}
}