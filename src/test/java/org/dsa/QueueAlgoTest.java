package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QueueAlgoTest {

    @Test
    void shouldReverseQueue() {
        Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(10,20,30,40,50));
        QueueAlgo.reverseQueue(queue);
        assertArrayEquals(new int[]{50,40,30,20,10}, queue.stream().mapToInt(i -> i).toArray());
    }
}