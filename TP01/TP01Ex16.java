import java.util.Scanner;
import java.lang.Math;

/**
 * @author João Paulo e Matheus Palinkas
 * 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
 * seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. 
 * Lembre-se que uma função trigonométrica trabalha em radianos.
 */

public class TP01Ex16 {
    
    public static void main(String[] args){
        double angulo, seno, coseno, tangente, radianos, secante;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        angulo = scan.nextInt();

        radianos = Math.toRadians(angulo);

        seno = Math.sin(radianos);
        coseno = Math.cos(radianos);
        tangente = Math.tan(radianos);
        secante = 1 / seno;

        System.out.println("Seno de " + angulo + "°: " + Math.round(seno * 100.0) / 100.0);
        System.out.println("Cosseno de " + angulo + "°: " + Math.round(coseno * 100.0) / 100.0);
        System.out.println("Tangente de " + angulo + "°: " + Math.round(tangente * 100.0) / 100.0);
        System.out.println("Secante de " + angulo + "°: " + Math.round(secante * 100.0) / 100.0);
    }
}