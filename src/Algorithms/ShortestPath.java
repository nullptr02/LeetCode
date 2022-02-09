package Algorithms;

import java.util.*;


//class implmenting the algorithm
public class ShortestPath {
    NodeS start, end;

    ShortestPath(NodeS start, NodeS end) {
        this.start = start;
        this.end = end;
    }

    public void bfs() {
        //Create queue
        Queue<NodeS> queue = new LinkedList<>();

        //Visit and add start node to the queue
        start.visited = true;
        queue.add(start);

        //BFS until queue is empty and not reached to the end node
        while (!queue.isEmpty()) {
            //pop a node from queue for search operation
            NodeS current_node = queue.poll();
            //Loop through neighbors node to find the 'end'
            for (NodeS node : current_node.neighbors) {
                if (!node.visited) {
                    //Visit and add the node to the queue
                    node.visited = true;
                    queue.add(node);
                    //update its precedings nodes
                    node.prev = current_node;
                    //If reached the end node then stop BFS
                    if (node == end) {
                        queue.clear();
                        break;
                    }
                }
            }
        }
        trace_route();
    }

    //Function to trace the route using preceding nodes
    private void trace_route() {
        NodeS node = end;
        List<NodeS> route = new ArrayList<>();
        //Loop until node is null to reach start node
        //becasue start.prev == null
        while (node != null) {
            route.add(node);
            node = node.prev;
        }
        //Reverse the route - bring start to the front
        Collections.reverse(route);
        //Output the route
        System.out.println(route);
    }

    //Driver Code
    public static void main(String[] args) {
        //create nodes
        NodeS node_A = new NodeS("A");
        NodeS node_B = new NodeS("B");
        NodeS node_C = new NodeS("C");
        NodeS node_D = new NodeS("D");
        NodeS node_E = new NodeS("E");

        //connect nodes (i.e. create graph)
        node_A.add_neighbor(node_B);
        node_B.add_neighbor(node_C);
        node_C.add_neighbor(node_D);
        node_D.add_neighbor(node_E);
        node_B.add_neighbor(node_E);

        new ShortestPath(node_A, node_E).bfs();
    }
}



//Class representing graph nodes
class NodeS {
    String name;
    List<NodeS> neighbors;
    boolean visited = false;
    NodeS prev = null;

    NodeS(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    //Method to connect nodes
    public void add_neighbor(NodeS node) {
        this.neighbors.add(node);
        node.neighbors.add(this);
    }

    //Node representation
    public String toString() {
        return this.name;
    }
}