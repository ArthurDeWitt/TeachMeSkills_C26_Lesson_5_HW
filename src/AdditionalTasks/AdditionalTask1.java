package AdditionalTasks;

/*
3.  Создайте двумерный массив целых чисел. Выведите на консоль сумму
	всех элементов массива.
 */
public class AdditionalTask1 {
    public static void main(String[] args) {
        // Create a two-dimensional array
        int[][] array = {{12,-2,65}, {92,33,42}};

        // Calculation of the sum of all array elements
        int sumOfElements = 0;
        for (int[] row : array) {
            for (int num : row) {
                sumOfElements += num;
            }
        }

        // Output result
        System.out.println("Sum of all array elements: " + sumOfElements);
    }
}
