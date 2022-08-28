import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 5.  Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
 */

public class TP02Ex05 {
    
    public static void main(String[] args){
        final int linhas = 3, colunas = 2;

        float[][] valores = new float[linhas][colunas];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < valores.length; i++){
            for(int j = 0 ; j < valores[i].length; j++){
                System.out.print("Entre o valor da posição ["+ i +"]["+ j +"]: ");
                valores[i][j] = scan.nextFloat();

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