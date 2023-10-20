import java.util.Scanner;

public class Lab3Z3 {
    public static void main(String[] args) {
        int[][] y = new int[3][3];

        // Wczytaj tablicę dwuwymiarową
        Tab2DReadPrint.readTab2D(y);

        // Wydrukuj oryginalną tablicę
        System.out.println("Oryginalna tablica:");
        Tab2DReadPrint.printTab2D(y);

        // Transponuj tablicę dwuwymiarową
        int[][] transposedY = Tab2DReadPrint.transpose2D(y);

        // Wydrukuj transponowaną tablicę
        System.out.println("Transponowana tablica:");
        Tab2DReadPrint.printTab2D(transposedY);
    }
}

class Tab2DReadPrint {
    // Metoda do wczytywania tablicy dwuwymiarowej typu int
    public static void readTab2D(int[][] x) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("Podaj liczbę dla [" + i + "][" + j + "]: ");
                x[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    // Metoda do drukowania tablicy dwuwymiarowej typu int
    public static void printTab2D(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Metoda do transponowania tablicy dwuwymiarowej typu int
    public static int[][] transpose2D(int[][] x) {
        int numRows = x.length;
        int numCols = x[0].length;
        int[][] result = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[j][i] = x[i][j];
            }
        }

        return result;
    }
}

