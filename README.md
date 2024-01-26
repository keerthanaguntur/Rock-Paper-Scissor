# Rock, Paper, Scissors Game

This Kotlin program implements a simple console-based Rock, Paper, Scissors game where the user plays against the computer. The game prompts the user to enter their choice (Rock, Paper, or Scissors), validates the input, randomly generates the computer's choice, and determines the winner based on the classic rules of the game.

## How to Play

1. Run the program.
2. Enter your choice when prompted (Rock, Paper, or Scissors).
3. The computer will randomly choose its move.
4. The winner will be determined based on the game rules (Rock crushes Scissors, Scissors cuts Paper, Paper covers Rock).

## Prerequisites

- Kotlin installed on your machine.

## How to Run

1. Clone this repository to your local machine.
   ```bash
   git clone https://github.com/keerthanaguntur/Rock-Paper-Scissor.git
   ```

2. Navigate to the project directory.
   ```bash
   cd rock_paper_scissors
   ```

3. Run the Kotlin program.
   ```bash
   kotlinc -include-runtime -d RockPaperScissors.jar RockPaperScissors.kt
   java -jar RockPaperScissors.jar
   ```

## Game Rules

- Rock crushes Scissors.
- Scissors cuts Paper.
- Paper covers Rock.
- Tie if both choose the same option.

## Sample Gameplay

```
Rock, Paper or Scissor ?
Enter your Choice
paper
scissor
Computer Wins!
```

## Note

- Make sure to enter a valid choice (Rock, Paper, or Scissors) when prompted. Invalid inputs will be rejected.

Feel free to contribute, report issues, or suggest improvements! Happy gaming!
