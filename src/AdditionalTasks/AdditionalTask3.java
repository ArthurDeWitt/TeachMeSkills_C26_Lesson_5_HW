package AdditionalTasks;
/*
  5. Создайте двумерный массив целых чисел. Отсортируйте элементы в
	 строках двумерного массива по возрастанию.
 */
import java.util.Arrays;

public class AdditionalTask3 {
    public static void main(String[] args) {

        // Create a two-dimensional array
        int[][] array = {{30, -2, 91}, {16, 52, -64}, {199, -8, -71}};

        // Sorting elements in rows in ascending order
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        // Output sorted array to the console
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
