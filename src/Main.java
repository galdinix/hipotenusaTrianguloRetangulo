import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double cat1, cat2, hipo;
        System.out.println("Informe um cateto:");
        cat1 = x.nextDouble();
        System.out.println("Informe um cateto:");
        cat2 = x.nextDouble();
        System.out.println("Informe a hipo:");
        hipo = x.nextDouble();

        double calcHipo = Math.sqrt(Math.pow(cat1, 2) + (Math.pow(cat2, 2)));
        if(calcHipo == hipo){
            System.out.println("Eh  um triangulo retangulo");
        } else {
            System.out.println("Nao eh um triangulo retangulo");
        }
    }
}