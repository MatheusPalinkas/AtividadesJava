import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
 */

public class TP01Ex08 {
    
    public static void main(String[] args){
		final float MILHA_EM_METROS = 1852;
		final float QUILOMETRO_EM_METROS = 1000;

        float milhas, quilometros;
    	Scanner scan = new Scanner(System.in);
        
    	System.out.print("Entre com o valor em milhas: ");
    	milhas = scan.nextFloat();

    	quilometros = (milhas * MILHA_EM_METROS) / QUILOMETRO_EM_METROS;
    	
    	System.out.println("A medida das milhas em quilômetros " + quilometros);
    }
}