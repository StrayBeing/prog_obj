import java.util.Scanner;
public class Third{
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe ");
        int liczba1 = skaner.nextInt();
        System.out.print("Podaj druga liczbe ");
        int liczba2 = skaner.nextInt();
        int doda =liczba1+liczba2;
        int odej =liczba1-liczba2;
        int mno =liczba1*liczba2;
        int dziel =liczba1/liczba2;
        int mod = liczba1%liczba2;
        System.out.print("Dodawanie: "+liczba1+"+"+liczba2+"="+doda+"\n");
        System.out.print("Odejmowanie: "+liczba1+"-"+liczba2+"="+odej+"\n");
        System.out.print("Mnozenie: "+liczba1+"*"+liczba2+"="+mno+"\n");
        System.out.print("Dzielenie: "+liczba1+"/"+liczba2+"="+dziel+"\n");
        System.out.print("Modulo: "+liczba1+"%"+liczba2+"="+mod+"\n");
        skaner.close();    
    }
}