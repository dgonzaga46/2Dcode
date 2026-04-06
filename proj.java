package main;


public class proj{
    public static void main(String[] args) {
        int numbers[][] = {
            {100, 200, 300, 400},
            {10, 20, 30, 40},
            {1, 2, 3, 4},
            {5, 15, 30, 90}
        };

        System.out.println("2D Array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }

        int x = -1, y = -1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == 15) {
                    x = i;
                    y = j;
                }
            }
        }

        if (x != -1 && y != -1) {
            System.out.println("\nNumber 15 is found at index: " + x + " & " + y);
        } else {
            System.out.println("\nNumber 15 not found.");
        }

        if (x != -1 && y != -1) {
            numbers[x][y] = 99;
        }

        System.out.println("\nUpdated 2D Array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}