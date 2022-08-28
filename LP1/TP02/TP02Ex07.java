import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4.
 * Após a digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
 */

public class TP02Ex07 {
    
    public static void main(String[] args){
        final int linhas = 3, colunas = 4;

        float[][] valores = new float[linhas][colunas];
        float multiplicador;
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
                valores[i][j] *= multiplicador;
            }
        }

        System.out.println("\n\n============== Matriz ==============\n");
        for(int i = 0; i < valores.length; i++){
            for(int j = 0 ; j < valores[i].length; j++){
                System.out.print(valores[i][j] + "   ");
            }
            System.out.println("");
        }
      
        scan.close();
    }
}