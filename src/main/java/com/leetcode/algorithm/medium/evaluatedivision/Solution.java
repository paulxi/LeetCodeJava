package com.leetcode.algorithm.medium.evaluatedivision;

import java.util.*;

//class Solution {
//  class Vertex {
//    String str;
//    boolean isZero;
//    Vertex(String str, boolean isZero) {
//      this.str = str;
//      this.isZero = isZero;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//      if (this == o) {
//        return true;
//      }
//      if (!(o instanceof Vertex)) {
//        return false;
//      }
//      Vertex vertex = (Vertex) o;
//      return isZero == vertex.isZero &&
//          str.equals(vertex.str);
//    }
//
//    @Override
//    public int hashCode() {
//      return Objects.hash(str, isZero);
//    }
//  }
//
//  class Edge {
//    double value;
//    Vertex from;
//    Vertex to;
//
//    Edge(Vertex from, Vertex to, double value) {
//      this.from = from;
//      this.to = to;
//      this.value = value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//      if (this == o) {
//        return true;
//      }
//      if (!(o instanceof Edge)) {
//        return false;
//      }
//      Edge edge = (Edge) o;
//      return Double.compare(edge.value, value) == 0 &&
//          from.equals(edge.from) &&
//          to.equals(edge.to);
//    }
//
//    @Override
//    public int hashCode() {
//      return Objects.hash(value, from, to);
//    }
//  }
//
//
//
//  class Graph {
//    Set<Vertex> vertices = new HashSet<>();
//    Map<Vertex, Set<Edge>> edges = new HashMap<>();
//
//    Graph() {
//    }
//
//    class Node {
//      Vertex vertex;
//      Edge edge;
//      Node parent;
//
//      Node(Vertex vertex, Edge edge) {
//        this.vertex = vertex;
//        this.edge = edge;
//      }
//    }
//
//    void addVertex(Vertex vertex) {
//      vertices.add(vertex);
//    }
//
//    void addEdge(Vertex from, Vertex to, double value) {
//      Edge edge = new Edge(from, to, value);
//      Set<Edge> fromEdges  = edges.get(from);
//      if (fromEdges == null) {
//        fromEdges = new HashSet<>();
//        fromEdges.add(edge);
//        edges.put(from, fromEdges);
//      } else {
//        fromEdges.add(edge);
//      }
//    }
//
//    List<Edge> findPaths(Vertex from, Vertex to) {
//      List<Vertex> visited = new LinkedList<>();
//      List<Edge> result = new LinkedList<>();
//
//      Stack<Node> stack = new Stack<>();
//      stack.push(new Node(from, null));
//      while (!stack.isEmpty()) {
//        Node node = stack.pop();
//        if (node.vertex.equals(to)) {
//          while (node.edge != null) {
//            result.add(0, node.edge);
//            node = node.parent;
//          }
//
//          return result;
//        } else {
//          Set<Edge> fromEdges = edges.get(node.vertex);
//          for (Edge edge: fromEdges) {
//            Vertex v = edge.to;
//            if (!visited.contains(v)) {
//              Node child = new Node(v, edge);
//              child.parent = node;
//              visited.add(v);
//              stack.push(child);
//            }
//          }
//        }
//      }
//
//      return result;
//    }
//
//    Vertex findVertex(String str) {
//      for (Vertex v: vertices) {
//        if (v.str.equals(str)) {
//          return v;
//        }
//      }
//      return null;
//    }
//  }
//
//  public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
//    Graph graph = new Graph();
//    for (int i = 0; i < equations.length; i++) {
//      Vertex from = new Vertex(equations[i][0], false);
//      graph.addVertex(from);
//      Vertex to = new Vertex(equations[i][1], false);
//      graph.addVertex(to);
//      double value = values[i];
//      graph.addEdge(from, to, value);
//
//      if (value == 0) {
//        from.isZero = true;
//      } else {
//        graph.addEdge(to, from, 1.0 / value);
//      }
//    }
//
//
//    double[] result = new double[queries.length];
//    for (int i = 0; i < result.length; i++) {
//      String[] query = queries[i];
//      Vertex from = graph.findVertex(query[0]);
//      Vertex to = graph.findVertex(query[1]);
//
//      if (from != null && to != null) {
//        if (from.equals(to)) {
//          if (from.isZero) {
//            result[i] = -1.0;
//          } else {
//            result[i] = 1.0;
//          }
//        } else {
//          List<Edge> edges = graph.findPaths(from, to);
//          if (edges.isEmpty()) {
//            result[i] = -1;
//          } else {
//            double value = 1.0;
//            for (Edge edge: edges) {
//              if (edge.to.isZero) {
//                result[i] = -1.0;
//                break;
//              } else {
//                value *= edge.value;
//              }
//            }
//            result[i] = value;
//          }
//        }
//      } else {
//        result[i] = -1;
//      }
//    }
//
//    return result;
//  }
//}

class Solution {
  public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
    Map<String, Map<String, Double>> numMap = new HashMap<>();
    for (int i = 0; i < equations.length; i++) {
      insert(numMap, equations[i][0], equations[i][1], values[i]);
      insert(numMap, equations[i][1], equations[i][0], 1.0 / values[i]);
    }

    double[] result = new double[queries.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = handleQuery(queries[i][0], queries[i][1], numMap);
    }

    return result;
  }

  private void insert(Map<String, Map<String, Double>> numMap, String num, String denom, double value) {
    Map<String, Double> map = numMap.get(num);
    if (map == null) {
      map = new HashMap<>();
      numMap.put(num, map);
    }
    map.put(denom, value);
  }

  private double handleQuery(String num, String denom, Map<String, Map<String, Double>> numMap) {
    if (!numMap.containsKey(num) || !numMap.containsKey(denom)) {
      return -1;
    }

    Set<String> visited = new HashSet<>();
    Stack<Node> stack = new Stack<>();
    visited.add(num);
    stack.push(new Node(num));

    while (!stack.isEmpty()) {
      Node node = stack.pop();
      if (node.state.equals(denom)) {
        LinkedList<Node> paths = new LinkedList<>();
        paths.add(node);
        while (node.parent != null) {
          paths.add(0, node.parent);
          node = node.parent;
        }

        double d = 1.0;
        for (int i = 0; i < paths.size() - 1; i++) {
          Map<String, Double> map = numMap.get(paths.get(i).state);
          d *= map.get(paths.get(i + 1).state);
        }
        return d;
      } else {
        Map<String, Double> map = numMap.get(node.state);
        if (map != null) {
          for (String str: map.keySet()) {
            if (!visited.contains(str)) {
              stack.push(new Node(str, node));
              visited.add(str);
            }
          }
        }
      }
    }
    return -1;
  }

  class Node {
    String state;
    Node parent;

    Node(String state) {
      this.state = state;
    }

    Node(String state, Node parent) {
      this.state = state;
      this.parent = parent;
    }
  }
}