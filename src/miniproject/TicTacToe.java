package miniproject;

import java.util.Scanner;

class Logic {

    boolean flag = true;

    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    public void findWinner(String[] s) {
        Scanner sc = getScanner();
        boolean xOne = s[0].equalsIgnoreCase("x");
        boolean xTwo = s[1].equalsIgnoreCase("x");
        boolean xThree = s[2].equalsIgnoreCase("x");
        boolean xFour = s[3].equalsIgnoreCase("x");
        boolean xFive = s[4].equalsIgnoreCase("x");
        boolean xSix = s[5].equalsIgnoreCase("x");
        boolean xSeven = s[6].equalsIgnoreCase("x");
        boolean xEight = s[7].equalsIgnoreCase("x");
        boolean xNine = s[8].equalsIgnoreCase("x");

        boolean oOne = s[0].equalsIgnoreCase("o");
        boolean oTwo = s[1].equalsIgnoreCase("o");
        boolean oThree = s[2].equalsIgnoreCase("o");
        boolean oFour = s[3].equalsIgnoreCase("o");
        boolean oFive = s[4].equalsIgnoreCase("o");
        boolean oSix = s[5].equalsIgnoreCase("o");
        boolean oSeven = s[6].equalsIgnoreCase("o");
        boolean oEight = s[7].equalsIgnoreCase("o");
        boolean oNine = s[8].equalsIgnoreCase("o");

        if ((xOne && xTwo && xThree) || (xOne && xFour && xSeven) || (xOne && xFive && xNine) || (xTwo && xFive && xEight) || (xThree && xFive && xSeven) || (xThree && xSix && xNine) || (xFour && xFive && xSix) || (xSeven && xEight && xNine) || (oOne && oTwo && oThree) || (oOne && oFour && oSeven) || (oOne && oFive && oNine) || (oTwo && oFive && oEight) || (oThree && oFive && oSeven) || (oThree && oSix && oNine) || (oFour && oFive && oSix) || (oSeven && oEight && oNine)) {

            if ((xOne && xTwo && xThree) || (xOne && xFour && xSeven) || (xOne && xFive && xNine) || (xTwo && xFive && xEight) || (xThree && xFive && xSeven) || (xThree && xSix && xNine) || (xFour && xFive && xSix) || (xSeven && xEight && xNine)) {
                System.out.println("\nPlayer 1 Wins!");
            } else {
                System.out.println("\nPlayer 2 Wins!");
            }
            sc.close();
            flag = false;
            System.exit(0);
        }
    }
}

public class TicTacToe {
    public static void main(String[] args) {
        Logic logic = new Logic();
        Scanner sc = logic.getScanner();
        int playerOneTurns = 0;
        int playerTwoTurns = 0;
        String[] s = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};
        int position;
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
            if (i == 2 || i == 5) {
                System.out.println();
            }
        }
        while (logic.flag) {

            if (playerOneTurns == playerTwoTurns) {
                System.out.println("\nPlayer 1's turn");
                System.out.println("Choose the position you want to put your mark: ");

                position = sc.nextInt();
                if (s[position - 1].equalsIgnoreCase("-")) {
                    s[position - 1] = "x";
                    playerOneTurns++;
                    for (int i = 0; i < s.length; i++) {
                        System.out.print(s[i] + " ");
                        if (i == 2 || i == 5) {
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("Invalid position. Please try again!");
                }

            }

            logic.findWinner(s);
            if (playerOneTurns + playerTwoTurns == 9) {
                System.out.println("\nIt's a Draw!");
                System.exit(0);
            }

            if (playerTwoTurns < playerOneTurns) {

                System.out.println("\nPlayer 2's turn");
                System.out.println("Choose the position you want to put your mark: ");

                position = sc.nextInt();
                if (s[position - 1].equalsIgnoreCase("-")) {
                    s[position - 1] = "o";
                    playerTwoTurns++;
                    for (int i = 0; i < s.length; i++) {
                        System.out.print(s[i] + " ");
                        if (i == 2 || i == 5) {
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("Invalid position. Please try again!");
                }
            }

            logic.findWinner(s);
        }

    }
}
