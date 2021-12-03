# Brick_Destroy
This is a simple arcace video game.
Player's goal is to destroy a wall with a small ball.

The game has very simple commmand:
SPACE start/pause the game.
A move left the player
D move rigth the player
ESC enter/exit pause menu
ALT+SHITF+F1 open console
the game automatically pause if the frame loses focus

Enjoy ;-))

# Refactoring
- Ball.java
1. break down the variables and refactor them. (on line 49)
2. add setDirection function to go up, down, left and right. (on line 77, 57-60)

- Brick.java
1. instead of declare start, end point one by one, refactoring the original direction. (on line 73)
2. declare point and use point start only for the location. (on line 112)

# Additions
- GameFrame.java
1. take palyer name. (on line 73)
2. back to home menu when the player press space. (on line 88)

- HomeMenu.java
1. change the background. (on line 170)
2. Modify the drawContainer for background. (on line 186)
3. Invisible text filed when the game start. (on line 414)

- PlayerName.java
1. add a text filed by using JFrame class.

- ScoreSave.java
1. Save player's socre and name.

- GameBoard.java
1. Score feature. (on line 93, 96, 147-166)