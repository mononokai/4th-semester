# Sorting #
- Bubble sort
  - simplest sorting algorithm
  - works by repeatedly swapping the adjacent elements if they're in the wrong order
- Insertion Sort
  - similar to how we sort playing cards in our hand
  - array is virtually split into a sorted and an unsorted part


# Dijkstra's Shortest Path #
- a greedy algorithm that solves the single-source shortest path problem for a graph with nonnegative edge weights
  - it just finds the shortest distance between two vertices on a graph
  - it's greedy in that it constantly selects the next unvisited vertex with the shortest known distance from the start vertex
- a greedy algorithm makes locally optimal choices at each stage in hopes of finding the global optimum
- maintains a set of visited vertices and a set of unvisited vertices
- iteratively selects unvisited vertices with the shortest distance from the source
  - it then visits the neighbors of that vertex and updates their distances if a shorter path is found
- this keeps going until the destination vertex is reached or all reachable vertices have been reached
- psuedo code:
  - distance from start vertex to start vertex = 0
  - distance to all other vertices from start = infinity
  - WHILE until all vertices visited:
    - visit the unvisited vertex with the shortest known distance from the start vertex (this will be the current vertex)
    - FOR each unvisited neighbor of current vertex:
      - calculate the distance from the start vertex
      - IF the calculated distance of this vertex is less than the known distance 
        - update the shortest distance to this vertex
        - update the previous vertex with the current vertex
    - add the current vertex to the list of visited vertices
