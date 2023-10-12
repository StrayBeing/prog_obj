import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fifth {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Wczytywanie pierwszej liczby
            System.out.print("Podaj pierwsza liczbe calkowita: ");
            String linia1 = br.readLine();
            int liczba1 = Integer.parseInt(linia1);

            // Wczytywanie drugiej liczby
            System.out.print("Podaj druga liczbe calkowita: ");
            String linia2 = br.readLine();
            int liczba2 = Integer.parseInt(linia2);

            // Obliczenia
            int suma = liczba1 + liczba2;
            int roznica = liczba1 - liczba2;
            int iloczyn = liczba1 * liczba2;
            double iloraz = (double) liczba1 / liczba2;
            int modulo = liczba1 % liczba2;

            // Wyswietlanie wynikow
            System.out.println("Suma: " + suma);
            System.out.println("Roznica: " + roznica);
            System.out.println("Iloczyn: " + iloczyn);
            System.out.println("Iloraz: " + iloraz);
            System.out.println("Suma modulo: " + modulo);

            // Zamykanie BufferedReader
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("To nie jest poprawna liczba calkowita.");
        }
    }
}
