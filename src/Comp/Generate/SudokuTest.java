package Comp.Generate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {

    @Test
    void sudoku() {
        Sudoku.Sudoku();
    }
    @Test
    void randomGenerator(){
        long unixTime = System.currentTimeMillis() / 1000L;
        System.out.println(unixTime);
        System.out.println(String.valueOf(Sudoku.randomGenerator()));
    }
}