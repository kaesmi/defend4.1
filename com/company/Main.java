package com.company;

public class Main {
    public static void main(String[] args) {
        MyGraph<String> graph = new MyGraph<>();

        // Adding vertices
        graph.addVertex("0");
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");
        graph.addVertex("4");

        // Adding directed edges
        graph.addEdge("0", "1");
        graph.addEdge("0", "2");
        graph.addEdge("1", "2");
        graph.addEdge("2", "3");
        graph.addEdge("3", "0");

        // Print the graph
        graph.printGraph();

        // Perform DFS traversal from a starting vertex
        System.out.print("DFS Traversal: ");
        graph.DFS("0");
        System.out.println();

        // Perform BFS traversal from a starting vertex
        System.out.print("BFS Traversal: ");
        graph.BFS("0");
        System.out.println();
    }
}