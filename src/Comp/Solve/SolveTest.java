package Comp.Solve;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static Comp.Solve.Solve.Solve;
import static org.junit.jupiter.api.Assertions.*;

class SolveTest {

    @Test
    void solve() {
        boolean[] Solve = Solve();
        boolean[] Correct = {false,false,false,false,false,false,false,false,false};
        Assert.assertArrayEquals(Correct, Solve);
    }
}