import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, 
 * sendo que no máximo 10x10. A matriz não precisa ser quadrática. 
 * Após a digitação dos elementos, calcular e exibir a matriz transposta.
 */

public class TP02Ex09 {
    
    public static void main(String[] args){
        int linhas, colunas;  
        float[][] matrizOriginal, matrizTransposta;
        Scanner scan = new Scanner(System.in);


        do{
            System.out.print("Entre com a quantidade de linhas da matriz: ");
            linhas = scan.nextInt();

            if(linhas < 0 || linhas > 10){
                System.out.println("A quantidade de linhas deve ser positivo, porém menor ou igual a dez");
            }
            
        }while(linhas < 0 || linhas > 10);

        do{
            System.out.print("Entre com a quantidade de colunas da matriz: ");
            colunas = scan.nextInt();

            if(colunas < 0 || colunas > 10){
                System.out.println("A quantidade de colunas deve ser positivo, porém menor ou igual a dez");
            }
            
        }while(colunas < 0 || colunas > 10);


        matrizOriginal = new float[linhas][colunas];
        matrizTransposta = new float[colunas][linhas];

        for(int i = 0; i < matrizOriginal.length; i++){
            for(int j = 0 ; j < matrizOriginal[i].length; j++){
                System.out.print("Entre o valor da posição ["+ i +"]["+ j +"]: ");
                matrizOriginal[i][j] = scan.nextFloat();

            }
        }

        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("\n\n============== Matriz original ==============\n");
        for(int i = 0; i < matrizOriginal.length; i++){
            for(int j = 0 ; j < matrizOriginal[i].length; j++){
                System.out.print(matrizOriginal[i][j] + "   ");
            }
            System.out.println("");
        }

        System.out.println("\n\n============== Matriz transposta ==============\n");
        for(int i = 0; i < matrizTransposta.length; i++){
            for(int j = 0 ; j < matrizTransposta[i].length; j++){
                System.out.print(matrizTransposta[i][j] + "   ");
            }
            System.out.println("");
        }
      
        scan.close();
    }
}