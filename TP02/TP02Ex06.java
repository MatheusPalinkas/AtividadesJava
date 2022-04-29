import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
 */

public class TP02Ex06 {
    
    public static void main(String[] args){
        final int linhas = 2, colunas = 3;

        String[][] nomes = new String[linhas][colunas];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < nomes.length; i++){
            for(int j = 0 ; j < nomes[i].length; j++){
                System.out.print("Entre o valor da posição ["+ i +"]["+ j +"]: ");
                nomes[i][j] = scan.nextLine();

            }
        }

        System.out.println("\n\n============== Matriz ==============\n");
        for(int i = 0; i < nomes.length; i++){
            for(int j = 0 ; j < nomes[i].length; j++){
                System.out.print(nomes[i][j] + "   ");
            }
            System.out.println("");
        }
      
        scan.close();
    }
}