package Week12;

import java.util.Scanner;

class TicTacToeApp {
    static Scanner userinput = new Scanner(System.in);
    char[][] board = {{'.', '.', '.'}, {'.', '.', '.'}, {'.', '.', '.'}};
    int turn = 1;
    char player = 'X';

    public void printBoard() {
        int i, j;
        System.out.println("");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void move(int i, int j) {
        board[i][j] = player;
        turn++;
    }

    public void unDoMove(int i, int j) {
        board[i][j] = '.';
        turn--;
    }

    public void switchPlayers() {
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }

    public boolean isLegal(int i, int j) {
        if (i < 0 || i > 2 || j < 0 || j > 2) {
            return false; // Out of bounds
        }
        return board[i][j] == '.';
    }

    public boolean winner() {
        int i;
        boolean test = false;
        for (i = 0; i <= 2; i++) {
            if ((board[i][0] == board[i][1]) && (board[i][1] == board[i][2]) &&
                    (board[i][0] != '.')) {
                test = true;
            }
            if ((board[0][i] == board[1][i]) && (board[1][i] == board[2][i]) &&
                    (board[0][i] != '.')) {
                test = true;
            }
        }
        if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) &&
                (board[0][0] != '.')) {
            test = true;
        }

        if ((board[2][0] == board[1][1]) && (board[1][1] == board[0][2]) &&
                (board[2][0] != '.')) {
            test = true;
        }
        return test;
    }

    public void human() {
        int i, j;
        boolean test = false; //have I found a place to go
        while (!test) {
            System.out.println("\nEnter Coordinates Where To Go Separated By A Space (1-3 for both row and column):");
            if (userinput.hasNextInt()) {
                i = userinput.nextInt();
                if (userinput.hasNextInt()) {
                    j = userinput.nextInt();
                    userinput.nextLine(); 
                    if (isLegal(i - 1, j - 1)) {
                        test = true;
                        move(i - 1, j - 1);
                    } else {
                        System.out.println("Invalid move: Cell is occupied or coordinates are out of bounds. Try again.");
                    }
                } else {
                    System.out.println("Invalid input: You must enter two integers. Try again.");
                    userinput.nextLine(); // Clear invalid input
                }
            } else {
                System.out.println("Invalid input: You must enter two integers. Try again.");
                userinput.nextLine(); // Clear invalid input
            }
        }
    }


    public void ai() {
        int i, j;
        // Winning move test
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (isLegal(i, j) == true) {
                    move(i, j);
                    if (winner()) {
                        System.out.println("AI is playing to win");
                        return;
                    }
                    unDoMove(i, j);
                }
            }
        }

        // Blocking move test
        switchPlayers();
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (isLegal(i, j) == true) {
                    move(i, j);
                    if (winner()) {
                        unDoMove(i, j);
                        switchPlayers();
                        move(i, j);
                        System.out.println("AI is blocking");
                        return;
                    }
                    unDoMove(i, j);
                }
            }
        }
        switchPlayers();

        // Take center test
        if (isLegal(1, 1)) {
            move(1, 1);
            System.out.println("AI is taking the center");
            return;
        }

        // Random
        boolean test = false;  //have I found a place to go
        while (test == false) {
            i = (int) (Math.random() * 3.0);
            j = (int) (Math.random() * 3.0);
            if (isLegal(i, j) == true) {
                test = true;
                move(i, j);
            }
        }
        System.out.println("AI is moving ... ");
    }
}

class ExampleTicTacToe {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToeApp game = new TicTacToeApp();
        game.printBoard();
        for (int i = 1; i <= 5; i++) {
            game.human();
            game.printBoard();
            if ((game.winner() == true) || (i == 5)) {
                break;
            }
            game.switchPlayers();
            game.ai();
            game.printBoard();
            if ((game.winner() == true) || (i == 5)) {
                break;
            }
            game.switchPlayers();
        }

        if (game.winner() == true) {
            System.out.println("\nThe winner is " + game.player);
        } else {
            System.out.println("\nTie Game!");
        }
    }
}
