
# Tic-Tac-Toe Game

## Overview
This is a simple **Tic-Tac-Toe game** built in Java with a console-based interface. Two players take turns to mark `X` or `O` in a 3x3 grid. The first player to align three of their marks in a row, column, or diagonal wins the game. If all cells are filled without a winner, the game ends in a draw.

## Key Features
- **Two-player Game**: Alternates turns between Player X and Player O.
- **Win Detection**: Checks for winning combinations after each move.
- **Draw Detection**: Ends the game in a draw if the grid is full and no winning combination is achieved.
- **Clean Console Output**: Prints the board after each move for easy tracking of the game state.

## Installation & Setup
1. **Clone** the repository or download the source code.
2. Make sure **Java** is installed on your system.
3. **Compile and Run** the `Main.java` file in your Java IDE or through the command line.

## Usage
1. **Run the program**.
2. Players will take turns entering their moves by specifying the row and column number (e.g., `1 2` for row 1, column 2).
3. The board is displayed after each move, showing the current state of the game.
4. The game announces the winner or declares a draw once the game ends.

## Example Gameplay
```
   1 2 3
1  - - -
2  - - -
3  - - -
```

1. **Player X** enters a move (e.g., row `1`, column `1`).
2. **Player O** then takes their turn, and the board updates accordingly.
3. After each move, the program checks for a winner or a draw and continues until one is found.

## Code Structure
- **Main.java**: Contains the main method that initializes and runs the game.
- **TicTacToe.java**: Contains the core game logic, including methods for displaying the board, checking for win conditions, and handling player moves.

## Learning Objectives
This project covers:
- **Basic Game Logic**: Understanding turn-based game mechanics.
- **Conditional Logic**: Using `if` statements to check for win conditions and valid moves.
- **Java Arrays**: Using a 2D array to represent the Tic-Tac-Toe board.
- **Method Decomposition**: Breaking down the game logic into manageable methods.

## Future Improvements
Consider adding:
- **Graphical User Interface (GUI)**: Implement a GUI version with Java Swing.
- **AI Opponent**: Add an option to play against a computer with basic AI.
- **Replay Option**: Allow players to restart the game without re-running the program.
