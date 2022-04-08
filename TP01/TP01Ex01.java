import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
 */

public class TP01Ex01 {
    
    public static void main(String[] args){
        float base, altura, area;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Entre com a altura de um retângulo: ");
    	altura = scan.nextFloat();
    	
    	System.out.print("Entre com base de um retângulo: ");
    	base = scan.nextFloat();
    	
    	area = base * altura;
    	
    	System.out.println("A área do retângulo é " + area);
    }
}