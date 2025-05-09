# Individual_Capstone
This is my Individual Capstone where I attempt to recreate the game [0hh1](https://0hh1.com/). In this game, players fill a grid with yellow and blue tiles while following three key rules: no three consecutive tiles of the same color can appear in any row or column, each row and column must contain an equal number of yellow and blue tiles, and no two rows or columns can be identical. Starting with some pre-placed tiles as hints, players must logically deduce the correct placements for the remaining tiles without breaking these rules.

## Classes and Objects
The game consists of two main classes: MyGame (the GUI driver) and GameMechanics (the logic handler). MyGame initializes the Swing-based interface, manages panel navigation via CardLayout, and tracks grid buttons (e.g., button4x, button6x) for each board size. GameMechanics enforces the game rules—checking for three consecutive tiles, duplicate rows/columns, and win conditions—while handling level generation from text files and button resets. Both classes encapsulate their functionality: MyGame focuses on UI flow, while GameMechanics isolates rule validation and state management.

## Class Diagram
![alt text](uml.png)
