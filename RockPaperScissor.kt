package com.example.rock_paper_scissor

fun main() {
    var computerChoice = ""
    var playerChoice = ""

    while (true) {
        println("Rock, Paper or Scissor ?\nEnter your Choice")
        playerChoice = readln().lowercase()
        if (playerChoice == "rock" || playerChoice == "paper" || playerChoice ==  "scissor") {
            break;
        }
        else {
            println("Invalid Input")
        }
    }

    val choice = (1..3).random()

    when (choice) {
        1 -> {
            computerChoice = "rock"
        }
        2 -> {
            computerChoice = "paper"
        }
        3 -> {
            computerChoice = "scissor"
        }
    }

    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissor" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissor" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's Tie!")
    }
    else {
        println("$winner Wins!")
    }
}
