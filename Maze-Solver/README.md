
# Maze Solver Project

## Overview
This is a simple Maze Solver project built in Java. It uses Breadth-First Search (BFS) and Depth-First Search (DFS) algorithms to find a path from the start to the end of a maze. The maze is represented as a 2D grid, where open paths and walls are indicated by different symbols.

## Key Features
- **Breadth-First Search (BFS)**: Explores the shortest path in an unweighted maze.
- **Depth-First Search (DFS)**: Explores a potential path to the end, possibly finding a solution quicker in simple mazes.
- **Maze Display**: A simple method to print the maze layout before and after solving.

## Installation & Setup
1. Clone the repository or download the code
2. Ensure Java is installed on your system or use an online IDE like Replit.
3. Compile and run the `Main.java` file.

## Usage
1. Customize the maze layout in `Main.java` as desired. Each cell in the 2D array represents:
   - `0` for a path
   - `1` for a wall
   - `S` for the start
   - `E` for the end
2. Run the program to solve the maze using BFS or DFS.
3. Observe the path found and how the maze is displayed.

### Example Maze
```java
int[][] maze = {
    {1, 0, 1, 1, 1},
    {1, 0, 1, 0, 1},
    {1, 0, 0, 0, 1},
    {1, 1, 1, 0, 1},
    {1, 1, 1, 0, 1}
};
```

## Learning Objectives
This project demonstrates:
- **Graph traversal algorithms**: Understanding BFS and DFS for pathfinding in grids.
- **Data structures**: Utilizing `Queue` for BFS and `Stack` (or recursion) for DFS.
- **Java Basics**: Practice with arrays, loops, and conditional statements.

## Future Improvements
- **Maze Generator**: Automatically create random mazes of varying sizes.
- **Visual Output**: Use a GUI library like Swing to visualize the maze-solving process.
- **Optimization**: Experiment with A* or other heuristic algorithms for more efficient pathfinding.

