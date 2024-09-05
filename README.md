A2 - Othello

Your assignment is to implement a variant of the game Othello according to the UML Class diagrams 
provided below and the original rules specified in this link:
https://www.worldothello.org/about/about-othello/othello-rules/official-rules/english

You will be evaluated primarily on how playable your game is. You will also be evaluated on having
followed the provided design. Lastly, and to a lesser extent, you will be evaluated on updates to the
design diagrams that you make and the justification of any changes from the original design (preferably
included as UML notes, but separate text may also be appropriate…keep it under two pages of text).

In this variant of Othello, some positions on the board will be unplayable. The starting position may
vary, and the rules for flipping pieces may be adjusted. The class diagrams provided will show you the
minimal object oriented approach that you should start with. You will likely add classes, and potentially
even methods and fields. If you do so, these changes should be documented in updated UML diagrams.

The program should draw the board using ASCII characters on the screen. Positional labelling along the
top and side will allow the input of movement coordinates via keyboard. Messages detailing the result
of moves and instructions for how the current player may take their turn will be output by the program
at the start of every turn. This assignment description shows traditional Othello disks, but the actual
implementation would show ASCII characters.

When a game starts a menu will be shown, with numeric options given:
1. Load a Game
2. Start a New Game
3. Quit

Should the user choose to load a game, the program should ask for a filename, load the game saved in
that file, then continue from where that game left off. When the user chooses to start a new game, two
player names should be requested before starting a new game with those two players as first and second
player, respectively. If a user chooses to quit, the program should close.

When laying out the board before starting, note that all corner square will be unplayable. This rule
does not come from standard Othello, but keep in mind that such unplayable squares will be the same
for every game, irrespective of starting position.

When starting a new game, the user will be offered different starting positions. They will enter a number
corresponding to one of these choices:

1. Four-by-Four Starting Position
2. Standard Starting Positions

Whether through starting a new game or loading an existing game, the current player will be given options to play:

The options for the current player are as follows:
• If the current player cannot move, they may choose to save, concede the game or, if they cannot 
make a play to take an opponent’s pieces they may forfeit their turn
• A player may choose to save, concede or make a move

Games should be saved as a text file, with first, second and current player names on the first three lines, 
then all the characters in the board state on the last line.

When a game is over, an appropriate message should be displayed indicating the current board state, who won.

As per the diagrams, implement the classes Game, Board, Position and Player. A Game should have
a Board and Players. The Position class should be abstract with two subclasses, PlayablePosition and
UnplayablePosition, inheriting from it. The Position class should have a pure virtual method named
”canPlay()” that returns a boolean value indicating whether the position is playable or not. The return
value should be ”true” for empty playable positions and ”false” for unplayable positions. The use of
polymorphism is required and recommended in this design.

There is some latitude on how one could approach the implementation, but one would want a play()
method that loops. A makeMove method and methods to determine whether a move converts any pieces
will be needed. A method to check if there are any valid moves left will be needed. Think about the game
problem and rules and include any additional methods, mindful of what should be public and private.

Classes should use Constructors that make clear how the life-cycle of the elements of the game (or their construction) will work.

Consider the UML Notes when implenting, as there may be some guidance there. In particular, it has
been noted that access/mutator methods are not shown/can be interpreted based on fields.

A3 - A Soft Landing

Dynamic Word List you will create a simple but useful Java class that manages a list of unique words. This task will test your ability to use data structures, particularly arrays, and work with strings. Additionally, you will learn about file input and output (I/O) in Java.

Objectives The objectives of this assignment are to: • Practice using arrays and managing dynamic data. • Develop skills in string manipulation. • Enhance problem-solving and debugging skills.

Problem Statement Your task is to implement the UniqueWords class in the a3 package. This class should maintain an array of unique words and provide the following functionalities: • Adding new words to the array. • Checking if a word is already present in the array. • Printing all unique words in the array.
Fields: • String[] words – an array of strings that starts with an initial size of 4. • int size – an integer that starts at 0.

Methods: • void addWord(String word) – a method that adds a word to the list if it is not already present. • void printWords() – Ignore case when testing if a word is in your list already. Words are printed in the order of firest occurrence. • int maxSize() – a method that prints the current size of the words array • int size() – a method that prints the value of size

Details: • The addWord method should first check if the word is already in the words array. • If the word is not present, it should be added to the array, and size should be incremented. • Add the new word. If the array becomes full (i.e., there is no room to add the next new word), create a new array with twice the size, copy over all the old word values. • Ignore case when testing if a word is in your list already.

