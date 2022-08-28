import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.
 */

public class TP02Ex01 {
    
    public static void main(String[] args){
        float valor1, valor2;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Entre com 0 1º valor: ");
    	valor1 = scan.nextFloat();

        do{
            System.out.print("Entre com 0 2º valor: ");
            valor2 = scan.nextFloat();

            if(valor1 >= valor2){
                System.out.println("O segundo valor deve ser maior que: " + valor1);
            }
            
        }while(valor1 >= valor2);

    	System.out.println("1º valor:" + valor1 + "\n2º valor:" + valor2);
        
        scan.close();
    }
}