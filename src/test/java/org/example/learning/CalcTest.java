package org.example.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @Test
    void testdivide() {
       Calc c =new Calc();
        int expectedresult=5;
       assertEquals(expectedresult, c.divide(15,3));
    }
}