import java.util.Scanner;

public class Third2 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.print("Podaj wartosc a: ");
        double a = skan.nextDouble();
        System.out.print("Podaj wartosc b: ");
        double b = skan.nextDouble();
        System.out.print("Podaj wartosc c: ");
        double c = skan.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Rownanie jest tozsamosciowe dla kazdej wartosci x.");
                } else {
                    System.out.println("Rownanie jest sprzeczne (nie ma rozwiazania).");
                }
            } else {
                System.out.println("Rownanie jest liniowe: " + "x = " + (-c / b));
            }
        } else {
            System.out.println("Rownanie jest kwadratowe.");
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Rownanie kwadratowe ma dwa pierwiastki rzeczywiste: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Rownanie kwadratowe ma jeden pierwiastek rzeczywisty: x = " + x);
            } else {
                double r = -b / (2 * a);
                double i = Math.sqrt(-delta) / (2 * a);
                System.out.println("Rownanie kwadratowe ma pierwiastki zespolone: ");
                System.out.println("x1 = " + r + " + " + i + "i");
                System.out.println("x2 = " + r + " - " + i + "i");
            }
        }
        skan.close();
    }
}