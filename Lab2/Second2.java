import java.util.Random;
import java.util.Scanner;


public class Second2 {
    private static Random r = new Random();
    private static Scanner s = new Scanner(System.in);
    public static void ranIn(int t){
        while(t>0){
            System.out.print(r.nextInt()+"\n");
            t--;
        }
    }
      public static void ranFloat(int t){
        while(t>0){
            System.out.print(r.nextFloat()+"\n");
            t--;
        }
    }
        public static void ranRange(int t,int n){
        while(t>0){
            System.out.print(r.nextInt(n)+"\n");
            t--;
        }
    }
       public static void ranRangeStat(int t){
        while(t>0){
            System.out.print((r.nextInt(20-(-10))-10)+"\n");
            t--;
        }
    }
    public static void main(String[] args) {
        System.out.print("Oto 5 liczb int generowanych pseudolosowo\n");
        ranIn(5);
        System.out.print("Oto 10 liczb float generowanych pseudolosowo\n");
        ranFloat(10);
        System.out.print("Podaj n\n");
        int n = s.nextInt();
        System.out.print("Oto 12 liczb int generowanych pseudolosowo z zakresu od 0 do "  +n+"\n");
        ranRange(12,n);
        System.out.print("Oto 15 liczb int generowanych pseudolosowo z zakresu od-10 do 20\n");
        ranRangeStat(15);
    }
}
