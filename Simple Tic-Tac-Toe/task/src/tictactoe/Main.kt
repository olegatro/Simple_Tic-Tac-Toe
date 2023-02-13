package tictactoe

const val EMPTY_CELL = " "

fun getGridAsString(grid: MutableList<MutableList<String>>): String {
    var gridString: String = ""

    for (row in grid) {
        gridString += "| ${row.joinToString(" ")} |\n"
    }

    return "---------\n$gridString---------"
}

fun isPlayerWin(grid: MutableList<MutableList<String>>, player: String): Boolean {
    for (i in 0..2) {
        // horizontal
        if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) {
            return true
        }

        // vertical
        if (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player) {
            return true
        }
    }

    // diagonal
    if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
        return true
    }

    if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
        return true
    }

    return false
}

fun isGridDraw(grid: MutableList<MutableList<String>>): Boolean {
    for (row in grid) {
        for (cell in row) {
            if (cell == EMPTY_CELL) return false
        }
    }

    return true
}

fun main() {
    val grid: MutableList<MutableList<String>> = mutableListOf(
        mutableListOf(EMPTY_CELL, EMPTY_CELL, EMPTY_CELL),
        mutableListOf(EMPTY_CELL, EMPTY_CELL, EMPTY_CELL),
        mutableListOf(EMPTY_CELL, EMPTY_CELL, EMPTY_CELL)
    )
    val playerList: List<String> = listOf("X", "O")
    var currentPlayerIndex: Int = 0
    var winPlayer: String = ""

    println(getGridAsString(grid))

    while (true) {
        val (cellRow, cellColumn) = readln().split(" ")

        when {
            cellRow !in "0".."9" || cellColumn !in "0".."9" -> {
                println("You should enter numbers!")
                continue
            }

            cellRow !in "1".."3" || cellColumn !in "1".."3" -> {
                println("Coordinates should be from 1 to 3!")
                continue
            }

            grid[cellRow.toInt() - 1][cellColumn.toInt() - 1] != EMPTY_CELL -> {
                println("This cell is occupied! Choose another one!")
                continue
            }
        }

        val player = playerList[currentPlayerIndex]

        grid[cellRow.toInt() - 1].removeAt(cellColumn.toInt() - 1)
        grid[cellRow.toInt() - 1].add(cellColumn.toInt() - 1, player)

        println(getGridAsString(grid))

        if (isPlayerWin(grid, player)) {
            winPlayer = player
            break
        }

        currentPlayerIndex = if (currentPlayerIndex == 0) 1 else 0

        if (isGridDraw(grid)) {
            break
        }
    }

    if (winPlayer.isNotEmpty()) {
        println("$winPlayer wins")
    } else {
        println("Draw")
    }
}
