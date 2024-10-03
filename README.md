# DataStructures-Assignment1-KateManuel
 Indiana Jones and the Template of Infinite Recursions Coding Challenges
 
Name: Kate Manuel
Student ID: C0915329

****Challenge** 1: The Array Artifact**
Description: This challenge implements a class ArtifactVault using an array to store ancient artifacts. Methods are provided to add, remove, search (linear and binary) artifacts.
Approach: I used a fixed-size array to store artifacts, and managed the insertion/removal of elements. Binary search is applied on a sorted array.
Assumptions/Decisions: The array is assumed to be sorted for binary search. If it isn’t sorted, a sorting method (Arrays.sort) is called.

**Challenge** 2: **The Linked List Labyrinth**
Description: This challenge creates a singly linked list called LabyrinthPath that stores locations. Methods are implemented to add a location, remove the last location, detect loops, and print the path.
Approach: I used basic linked list techniques to manage nodes. For loop detection, Floyd’s cycle detection algorithm was applied.
Assumptions/Decisions: The linked list doesn’t have a fixed size. I implemented efficient traversal for adding and removing nodes.

**Challenge 3: The Stack of Ancient Texts**
Description: This challenge implements a stack (ScrollStack) using Java's Stack class to manage ancient scrolls with push, pop, peek, and search operations.
Approach: I leveraged Java's built-in stack implementation to provide stack operations while adding a search feature using the contains method.
Assumptions/Decisions: The stack is unbounded in size, and I assumed no restrictions on the number of scrolls.

**Challenge 4: The Queue of Explorers**
Description: This challenge implements a circular queue (ExplorerQueue) for managing explorers. Methods for enqueueing, dequeueing, checking the next explorer, and handling the full/empty states are provided.
Approach: The queue is implemented using a fixed-size array with front and rear pointers, managing circular behavior with the modulus operator.
Assumptions/Decisions: The queue is fixed in size, and no dynamic resizing is implemented for simplicity.

**Challenge 5: The Binary Tree of Clues**
Description: This challenge implements a binary tree (ClueTree) to store clues. The tree supports insertion, in-order, pre-order, and post-order traversals, searching for a specific clue, and counting the total number of clues.
Approach: I used a recursive approach to handle tree traversals and insertions. Each node stores a clue and pointers to its left and right children.
Assumptions/Decisions: The tree is unbalanced, and I did not implement balancing algorithms like AVL trees.

**Running the Code**
Prerequisites
Java Development Kit (JDK) installed (version 8 or higher)
Git installed (optional, for downloading the repository)
**Steps to Run:**
1. Clone the repository to your local machine.
2. Open the project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA).
3. Navigate to the respective Java class files for each challenge.
4. In your IDE, run the main method in each class to test the functionality.
5. Run the code from the command line.
