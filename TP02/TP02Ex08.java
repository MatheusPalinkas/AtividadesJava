import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4.
 * Após a digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições correspondentes.
 * Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por colunas.
 */

public class TP02Ex08 {
    
    public static void main(String[] args){
        final int linhas = 3, colunas = 4;

        float multiplicador;
        float[][] valores = new float[linhas][colunas];
        float[][] valoresMultiplicados = new float[linhas][colunas];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < valores.length; i++){
            for(int j = 0 ; j < valores[i].length; j++){
                System.out.print("Entre o valor da posição ["+ i +"]["+ j +"]: ");
                valores[i][j] = scan.nextFloat();

            }
        }

        System.out.print("Entre a constante multiplicativa: ");
        multiplicador = scan.nextFloat();

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valoresMultiplicados[i][j] = valores[i][j] * multiplicador;
            }
        }

        System.out.println("\n\n============== Matriz original ==============\n");
        for(int i = 0; i < valores.length; i++){
            for(int j = 0 ; j < valores[i].length; j++){
                System.out.print(valores[i][j] + "   ");
            }
            System.out.println("");
        }

        System.out.println("\n\n============== Matriz multiplicada ==============\n");
        for(int i = 0; i < valoresMultiplicados.length; i++){
            for(int j = 0 ; j < valoresMultiplicados[i].length; j++){
                System.out.print(valoresMultiplicados[i][j] + "   ");
            }
            System.out.println("");
        }
      
        scan.close();
    }
}