Adventures of "Name of the person playing”
Class TextAdventure:
It contains the rules for playing, the description of the game[Treasure hunt, here the player has to solve puzzles using their brain and should do as the puzzle tells them to for example, the key to a door is in a box and to find the box, we need to solve the puzzle written on the door. It will be like “Majestic and dangerous “ and the player has to select the most related object from the surroundings in which the correct selection unlocks the door and so on(can use if else statements)
(Use the println function for displaying the rules and description.)
Press any key to continue…(can use a string and get input )
Class AdventureModel:
Get input from the player, execute them such as using string input such as show what all are there in the room. Then it tells the player about the surroundings, and the player chooses to move. Taking different objects along the path gives the player lives and moving to different rooms gives points. Once a room is accessed, the player goes there as many times as possible. Unlocking a room involves performing a task such as filling water or solving a puzzle. For solving puzzles correct answers should be given to questions asked. The answer to these questions are not case sensitive(we could use,.equalsIgnoreCase() method) and we can implement these by using if else statements. Description of the game:- "King Johar was a Clever and brave king. He kept all his wealth in a secret room in his castle. The way to that room is full of obstacles. Overcome all the obstacles to win the game. Press any key to continue.” 
Class Adventurer:
Contains the actions the character does such as take something(gets stored in a list), eat something(can be modified by if else statement like, if he/she eats a specific apple(user types the word eat) the number specifying the life count increases by one. , hit something, drop something(removed from the list), etc. make an interface, and add methods that correspond to various actions.
Class Rooms:
Has a description of how it looks where everything is located(direction). Entering that room makes the code display the description and the properties of various things in the room from which the player selects things according to their calculations. Each room has a while loop that breaks only when the answer is correct and after it breaks, the data from the room gets saved in a list that can further be accessed.
AdventurerClass:
The player will have a bag for carrying items and to use them in need. The player can also take things along the way. (To implement these steps we could use the concept of Arrays to add, delete or store things.)

ThingsClass:
Contains all the objects used in the game. Here the objects will be the things that help the player to choose the right answers.
