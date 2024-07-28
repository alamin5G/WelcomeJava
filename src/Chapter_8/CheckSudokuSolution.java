package Chapter_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] grid = readSolution();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(isValid(grid) ? "Solution Correct" : "Incorrect Solution");
    }

    public static int[][] readSolution() throws FileNotFoundException {
        int[][] grid = new int[9][9];
        //reading data from txt file
        Scanner in = new Scanner(new File("sudokuSampleSolutionData.txt"));
        System.out.println("Enter Sudoko Solution: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid)) {
                    return false;
                }
            }

        }
        return true;

    }
    public static boolean isValid(int row, int col, int[][] grid) {
        for (int i = 0; i < 9; i++) {
            if (i != col && grid[row][i] == grid[row][col]) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i != row && grid[i][col] == grid[row][col]) {
                return false;
            }
        }

        for (int i = (row/3)*3; i < (row/3)*3+3; i++) {
            for (int j = (col/3)*3; j <(col/3)*3+3 ; j++) {
                if (!(row == i && col == j) && grid[i][j] == grid[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }

}
