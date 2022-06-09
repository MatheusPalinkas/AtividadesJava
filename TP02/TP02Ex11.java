import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, 
 * sendo que no máximo será de ordem 10 e quadrática. Após * a digitação dos elementos, 
 * calcular e exibir determinante da matriz.
 */

public class TP02Ex11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Give the value of N for [N x N]: ");
        n=s.nextInt();
        double a[][]=new double [n][n];
        //Storing Values in the Array !
        for (int i=0;i<n;i++)
         for (int j=0;j<n;j++)
          a[i][j]=s.nextInt();
        // Conversion of matrix to upper triangular 
           for(int i = 0; i < n; i++)
           {
               for(int j = 0; j < n; j++)
                   if(j>i)
                   {
                       double ratio = a[j][i]/a[i][i];
                       for(int k = 0; k < n; k++)
                           a[j][k] -= ratio * a[i][k];                      
                   }
           }
           double det = 1.0; //storage for determinant
           for(int i = 0; i < n; i++)
               det *= a[i][i];
           System.out.println("The Det is : "+det);
           s.close();
       }
}