import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 10. Entrar com uma matriz de ordem MxM, onde a ordem também será
 * escolhida pelo usuário, sendo que no máximo será de ordem 10 e
 * quadrática. Após a digitação dos elementos, calcular e exibir a
 * matriz inversa. Exibir as matrizes na tela, sob a forma matricial
 * (is x js)..
 */

public class TP02Ex10 {

    public static void main(String args[]){
      
        Scanner scan = new Scanner(System.in);
        int ordem = 0;

        System.out.println("Entre com a ordem da Matriz: ");
        ordem = scan.nextInt();

        float matriz[][] = new float[ordem][ordem];
        float ident[][] = new float[ordem][ordem];
        float pivo = 0, m = 0;

        for(int i = 0; i < matriz.length; i++){
          for(int j = 0 ; j < matriz[i].length; j++){
              System.out.print("Entre o valor da posição ["+ i +"]["+ j +"]: ");
              matriz[i][j] = scan.nextFloat();

          }
        }
        System.out.print("Matriz: \n");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (i == j) {
                    ident[i][j] = 1;
                } else {
                    ident[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < ordem; j++) {
            pivo = matriz[j][j];
            for (int k = 0; k < ordem; k++) {
              matriz[j][k] = (matriz[j][k]) / (pivo); 
                ident[j][k] = (ident[j][k]) / (pivo); 
            }

            for (int i = 0; i < ordem; i++) {
                if (i != j) {
                    m = matriz[i][j];
                    for (int k = 0; k < ordem; k++) {
                      matriz[i][k] = (matriz[i][k]) - (m * matriz[j][k]); 
                        ident[i][k] = (ident[i][k]) - (m * ident[j][k]);
                    }
                }
            }
        }

        System.out.print("Matriz inversa: \n");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(ident[i][j] + "\t");
            }
            System.out.println("");
        }
    
	}
}