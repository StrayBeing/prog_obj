import java.util.Scanner;
public class Sixth{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        double gal = 0;
        boolean test = false;      
        while (!test) {
            System.out.print("Podaj ilosc paliwa w galonach: ");
            if (scanner.hasNextDouble()) {
                gal = scanner.nextDouble();
                if (gal > 0) {
                    test = true;
                } else {
                    System.out.println("Wprowadz liczbe wieksza od zera.");
                }
            } else {
                System.out.println("Wprowadz poprawna liczbe.");
                scanner.next(); 
            }
        }
        System.out.println(gal+" galonow to "+gal*3.78541178+"litrow");
        scanner.close();
    }
    
}
