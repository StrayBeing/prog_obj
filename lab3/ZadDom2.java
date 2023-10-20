public class ZadDom2 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println("Macierz 1:");
        Matrix.printMatrix(matrix1);

        System.out.println("Macierz 2:");
        Matrix.printMatrix(matrix2);

        int[][] sumResult = Matrix.add(matrix1, matrix2);
        System.out.println("Wynik dodawania macierzy:");
        Matrix.printMatrix(sumResult);

        int[][] multiplyResult = Matrix.multiply(matrix1, matrix2);
        System.out.println("Wynik mnożenia macierzy:");
        Matrix.printMatrix(multiplyResult);

        int[][] transposeResult = Matrix.transpose(matrix1);
        System.out.println("Transpozycja macierzy 1:");
        Matrix.printMatrix(transposeResult);

        int rowSum = Matrix.sumRow(matrix1, 1);
        System.out.println("Suma wiersza 1 macierzy 1: " + rowSum);

        int colSum = Matrix.sumColumn(matrix2, 2);
        System.out.println("Suma kolumny 2 macierzy 2: " + colSum);

        int totalSum = Matrix.sumAllElements(matrix1);
        System.out.println("Suma wszystkich elementów macierzy 1: " + totalSum);
    }
}
