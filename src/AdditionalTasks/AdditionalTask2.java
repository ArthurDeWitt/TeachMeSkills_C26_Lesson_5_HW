package AdditionalTasks;
/*
Создайте двумерный массив. Выведите на консоль диагонали массива.
 */
public class AdditionalTask2 {
    public static void main(String[] args) {

        // Create a two-dimensional array
        int [][] myArray = {{18,92,73}, {0,12,43}, {67,82,31}};

        // Output the main diagonal of an array
        System.out.println("Main diagonal: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i][i] + " ");
        }

        // Side diagonal output
        System.out.println("Side diagonal: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i][myArray.length - 1 - i] + " ");
        }
    }
}
