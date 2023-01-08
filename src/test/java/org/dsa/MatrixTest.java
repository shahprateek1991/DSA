package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void shouldTraverseMatrixInSnakePattern() {
        assertEquals(List.of(1,2,3), Matrix.snakeTraversal(new int[][]{{1,2,3}}));
        assertEquals(List.of(1,2,3,6,5,4,7,8,9), Matrix.snakeTraversal(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        assertEquals(List.of(1,2,3,6,5,4,7,8,9,12,11,10),
                Matrix.snakeTraversal(new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}));
    }
}