import java.util.Scanner;
public class Fourth{
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe ");
        double liczba1 = skaner.nextDouble();
        System.out.print("Podaj druga liczbe ");
        double liczba2 = skaner.nextDouble();
        double doda =liczba1+liczba2;
        double odej =liczba1-liczba2;
        double mno =liczba1*liczba2;
        double dziel =liczba1/liczba2;
        double mod = liczba1%liczba2;
        System.out.printf("Dodawanie: %f + %f = %f%n", liczba1, liczba2, doda);
        System.out.printf("Odejmowanie: %f - %f = %f%n", liczba1, liczba2, odej);
        System.out.printf("Mnozenie: %f * %f = %f%n", liczba1, liczba2, mno);
        System.out.printf("Dzielenie: %f / %f = %f%n", liczba1, liczba2, dziel);
        System.out.printf("Modulo: %f %% %f = %f%n", liczba1, liczba2, mod);
        skaner.close();    
    }
}