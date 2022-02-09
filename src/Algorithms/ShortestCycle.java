package Algorithms;

import java.util.*;

public class ShortestCycle {

    static final int N = 100200;
    @SuppressWarnings("unchecked")
    static Vector<Integer>[] gr = new Vector[N];
    int[][] graph = new int[N][N];

    // Function to add edge
    static void Add_edge(int x, int y) {
        gr[x].add(y);
        gr[y].add(x);
    }

    // Function to find the length of
    // the shortest cycle in the graph
    static int shortest_cycle(int n) {

        if (n == 0) {
            return -1;
        }

        // To store length of the shortest cycle
        int result = Integer.MAX_VALUE;

        // For all vertices
        for (int i = 0; i < n; i++) {

            int[] distanceArray = new int[n];
            Arrays.fill(distanceArray, Integer.MAX_VALUE);

            int[] parentArray = new int[n];
            Arrays.fill(parentArray, Integer.MIN_VALUE);

            int[][] parentDistanceArray = new int[n][2];

            distanceArray[i] = 0;
            Queue<Integer> vertexQueue = new LinkedList<>();

            vertexQueue.add(i);

            while (!vertexQueue.isEmpty()) {

                int vertexElement = vertexQueue.poll();

                for (int child : gr[vertexElement]) {

                    if (parentArray[vertexElement] != child && parentArray[child] != vertexElement && distanceArray[child] != Integer.MAX_VALUE) {
                        int temp = (distanceArray[vertexElement] + distanceArray[child] + 1);
                        result = Math.min(result, temp);


                    } else if (distanceArray[child] == Integer.MAX_VALUE) {

                        distanceArray[child] = 1 + distanceArray[vertexElement];
                        parentArray[child] = vertexElement;
                        vertexQueue.add(child);

                    }

                }
            }
        }

        return result;
    }

    // Driver Code
    public static void main(String[] args) {

        for (int i = 0; i < N; i++)
            gr[i] = new Vector<>();

        // Number of vertices
        int n = 7;

        // Add edges
        Add_edge(0, 6);
        Add_edge(0, 5);
        Add_edge(5, 1);
        Add_edge(1, 6);
        Add_edge(2, 6);
        Add_edge(2, 3);
        Add_edge(3, 4);
        Add_edge(4, 1);

        // Function call
        System.out.println(shortest_cycle(n));
    }
}
