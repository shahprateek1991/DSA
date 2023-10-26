package org.dsa;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphAlgo {

    public static void bfs(List<List<Integer>> adjList, Integer source) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adjList.size()+1];
        queue.add(source);
        visited[source] = true;

        while (queue.size() != 0) {
            Integer element = queue.poll();
            System.out.println(element + " ");
            for (Integer node : adjList.get(element)) {
                if (!visited[node]) {
                    queue.add(node);
                }

            }
        }
    }
}
