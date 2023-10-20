
public class Lab3Z4 {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Pierwsza
        Pierwsza pierwsza = new Pierwsza();

        // Wywołanie metody Oblicz i wydrukowanie wyniku
        double wynik = pierwsza.Oblicz(5); // Przykład obliczenia sumy odwrotności silni dla n = 5
        System.out.println("Wynik: " + wynik);
    }
}

class Pierwsza {
    // Prywatna metoda do obliczania silni
   private int silnia(int n) {
    int wynik = 1;
    for (int i = 1; i <= n; i++) {
        wynik *= i;
    }
    return wynik;
}

    // Metoda do obliczania sumy odwrotności silni kolejnych liczb całkowitych od 1 do n
    public double Oblicz(int n) {
        double suma = 0.0;
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / silnia(i);
        }
        return suma;
    }
}

