package AdditionalTasks;
/*
2.  Умножение двух матриц
	Создайте два массива целых чисел размером 3х3 (две матрицы).
	Напишите программу для умножения двух матриц.
	Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
	Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
	Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */

public class AdditionalTask0 {
    public static void main(String[] args) {

        // Define two matrices of size 2x2 and assign them values
        int[][] firstMatrix = { {1,0,0,0}, {0,1,0,0}, {0,0,0,0} };
        int[][] secondMatrix = { {1,2,3}, {1,1,1}, {0,0,0}, {2,1,0} };

        // Call the multiplyMatrices method to multiply the matrices and store the result
        int[][] result = multiplyMatrices(firstMatrix, secondMatrix);

        // Print the result of the program
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Implementation of the multiplyMatrices method (thanks to Google)
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        // Create a new matrix of size firstMatrix.length by secondMatrix[0].length to store the result
        int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

        // Use three nested loops to multiply the matrices
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                for (int k = 0; k < secondMatrix.length; k++) {
                    // Compute each element of the new matrix by summing the products of corresponding elements of the matrices
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Return the resulting matrix
        return result;
    }
}


