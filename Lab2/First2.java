import java.util.Scanner;
public class First2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Podaj x: ");   
        while (!scanner.hasNextFloat()) {
            System.out.print("Podaj x typu double: ");               
            scanner.next(); 
            }
        double x = scanner.nextDouble();;
        double log2 = Math.log(x - 1) / Math.log(2);
        double ctg3 = Math.cbrt(1/Math.tan(x));
        double ceil3 = Math.ceil(Math.pow(3, x));
        double ex3 = Math.pow(Math.pow(Math.E, x), 3);
        double tan = Math.tan(x);
        double absin =Math.log(Math.abs(Math.sin(x)));
        double pis = Math.pow(Math.PI, x);
        double up = log2+ctg3+ceil3+ex3;
        double down = tan+absin+pis;
        double y = up/down;
        System.out.println(y+"\n");
        scanner.close();
    }
}
