import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        
        //1) Entrar com o raio de um círculo
        //2) Calcular a àrea do circulo
        // PI() * POTÊNCIA (C3;2)


        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o raio do circulo: ");
        double raio = sc.nextDouble();
        sc.close();


        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A àrea do circulo de raio" + raio + "igual a " + area);


    }
}
