package Homework;

/*
0.  Создать трехмерный массив из целых чисел.
	С помощью циклов "пройти" по всему массиву и увеличить каждый
	элемент на заданное число. Пусть число, на которое будет
	увеличиваться каждый элемент, задается из консоли.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        // Create a three-dimensional array in size 3х3х3
        int[][][] array = {
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}}
        };
        // Array output
        System.out.println("Original array");
        System.out.println(Arrays.deepToString(array));

        // Input the value of how much to increase each element of the array
        System.out.println("Input the value of how much to increase each element of the array");
        Scanner scanner = new Scanner(System.in);
        int incrementValue = scanner.nextInt();

        // Pass each element of arrays by loop "for"
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    array[i][j][k] += incrementValue;
                    System.out.print(array[i][j][k] + " ");
                }
            }
        }
    }
}
