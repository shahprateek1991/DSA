package org.dsa;

import java.util.Queue;

public class QueueAlgo {

    public static void reverseQueue(Queue<Integer> queue) {
        Integer element = queue.poll();
        if (element == null) {
            return;
        }
        reverseQueue(queue);
        queue.offer(element);
    }
}
