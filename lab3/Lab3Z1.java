import java.util.Scanner;

public class Lab3Z1 {
    private static double[] tab;

    public static void readTab1D(double[] x) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.print("Podaj jaka liczba dla indeksu " + i + ": ");
            x[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public static void printTab1D(double[] x) {
        System.out.println("Tablica liczb typu double:");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
    public static double[] maxMin(double[] x) {
        if (x.length == 0) {
            return null; // Jeśli tablica jest pusta, zwracamy null
        }

        double[] result = new double[2];
        result[0] = result[1] = x[0]; // Inicjalizacja wartości minimalnej i maksymalnej

        for (int i = 1; i < x.length; i++) {
            if (x[i] < result[0]) {
                result[0] = x[i]; // Aktualizacja wartości minimalnej
            } else if (x[i] > result[1]) {
                result[1] = x[i]; 
            }
        }

        return result;
    }
    public static void main(String[] args) {
        tab = new double[5];
        readTab1D(tab);
        printTab1D(tab);
        double [] rese = maxMin(tab);
        printTab1D(rese);
    }
}

