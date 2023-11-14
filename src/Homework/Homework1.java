package Homework;

/*
1.  Шахматная доска
	Создать программу для раскраски шахматной доски с помощью цикла.
	Создать двумерный массив String'ов 8х8. С помощью циклов задать
	элементам циклам значения B(Black) или W(White). Результат работы
	программы:
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
 */

public class Homework1 {
    public static void main(String[] args) {
        // Create an array of 8x8 strings and set the initial color of the chessboard (white)
        String[][] chessBoard = new String[8][8];
        String whiteColor = "W";

        // Filling the board using a loop
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {

                // Set the current cell color
                chessBoard[i][j] = whiteColor;

                // Change the color to the opposite color for the NEXT CELL
                whiteColor = (whiteColor.equals("W")) ? "B" : "W"; // Elvis operator
            }

            // Switch the color to the opposite color for the NEXT LINE
            whiteColor = (whiteColor.equals("W")) ? "B" : "W";
        }

        // Output the result of work
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
