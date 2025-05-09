# Individual_Capstone
This is my Individual Capstone where I attempt to recreate the game [0hh1](https://0hh1.com/). In this game, players fill a grid with yellow and blue tiles while following three key rules: no three consecutive tiles of the same color can appear in any row or column, each row and column must contain an equal number of yellow and blue tiles, and no two rows or columns can be identical. Starting with some pre-placed tiles as hints, players must logically deduce the correct placements for the remaining tiles without breaking these rules.

## Classes and Objects
The game consists of two main classes: MyGame (the GUI driver) and GameMechanics (the logic handler). MyGame initializes the Swing-based interface, manages panel navigation via CardLayout, and tracks grid buttons (e.g., button4x, button6x) for each board size. GameMechanics enforces the game rules—checking for three consecutive tiles, duplicate rows/columns, and win conditions—while handling level generation from text files and button resets. Both classes encapsulate their functionality: MyGame focuses on UI flow, while GameMechanics isolates rule validation and state management.

## Class Diagram
The class diagram can be found [here](https://github.com/BrentSanico1/Individual_Capstone/blob/55bf3a04e5c01626c9f6da0a82d34822aa50c6f2/Ohno/src/uml.png) to not take too much space.

## Four OOP Principles
### Abstraction
The [GameMechanics](Ohno/src/Game/Levels/GameMechanics.java) class abstracts complex puzzle logic (e.g., rule validation and level loading) behind methods like checkRules() and createLevel(), shielding [MyGame](Ohno/src/Game/MyGame.java) from implementation details.

### Encapsulation
Private fields (e.g., initialColors, gridSize) and controlled methods (e.g., resetButtons()) ensure data integrity, while [MyGame](Ohno/src/Game/MyGame.java) encapsulates UI components like JButton lists.

### Inheritance
The project implicitly inherits from Swing classes (e.g., MyGame extends JFrame), leveraging pre-built GUI functionality without reinventing core features.

### Polymorphism
Dynamic method execution is achieved through Swing’s event system (e.g., JButton actions invoking overridden actionPerformed logic), allowing flexible interactions across different board sizes.

## Exception Handline
The game handles file operations safely in [GameMechanics](Ohno/src/Game/Levels/GameMechanics.java) using try-catch blocks when reading level files, catching potential IOException errors if files are missing or corrupted, while the reset functionality provides a straightforward recovery method if issues occur during gameplay.

## File Handling
The game loads puzzle levels from text files stored in the [Levels](Ohno/src/Game/Levels) package (e.g., levels4x.txt). In [GameMechanics](Ohno/src/Game/Levels/GameMechanics.java), these files are read using a BufferedReader within a try-catch block to handle potential IOException errors. Each level file contains pre-configured puzzle layouts that are parsed to initialize the game board.

## Graphical User Interface
The game features a minimalist interface inspired by the original 0hh1 game, using Swing components for all UI elements. The main window implements a fullscreen JFrame with a card-based layout system (CardLayout) to switch between menu screens (Main Menu, Level Select, About) and puzzle boards. Game boards display as simple grids of colored JButton tiles (yellow/blue/gray) with clear visual feedback when clicked. All navigation buttons follow consistent styling, and the interface remains functional across different screen resolutions due to the fullscreen implementation.


