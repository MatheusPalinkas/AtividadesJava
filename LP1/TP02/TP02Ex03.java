import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 3. Entrar via teclado com 'N'  valores quaisquer. O valor 'N' (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos 'N' valores, exibir:
    - O maior valor;
    - O menor valor;
    - A soma dos valores;
    - A média aritmética dos valores;
    - A porcentagem de valores que são positivos;
    - A porcentagem de valores negativos;

Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o programa em função dessa resposta.
 */

public class TP02Ex03 {
    
    public static void main(String[] args){
        int qtdNumeros;
    	float[] valores;
        float numMaior = 0, numMenor = 0, soma = 0, media = 0, porcentagemPositivos = 0, porcentagemNegativos = 0;
        String finalizar = "N";
        Scanner scan = new Scanner(System.in);

        do {
            do{
                System.out.print("Entre com a quantidade de numeros que serão digitados: ");
                qtdNumeros = scan.nextInt();

                if(qtdNumeros < 0 || qtdNumeros > 20){
                    System.out.println("A quantidade digitada deve ser positivo, porém menor que vinte");
                }
                
            }while(qtdNumeros < 0 || qtdNumeros > 20);

            valores = new float[qtdNumeros];

            for(int i = 0; i < valores.length; i++){
                System.out.print("Entre o " + (i + 1) + "º valor: ");
                valores[i] = scan.nextFloat();

                if(i == 0){
                    numMaior = valores[i]; 
                    numMenor = valores[i]; 
                }else if(valores[i] > numMaior){
                    numMaior = valores[i]; 
                }else if(valores[i] < numMenor){
                    numMenor = valores[i]; 
                }

                if(valores[i] > 0){
                    porcentagemPositivos++;
                }else if(valores[i] < 0){
                    porcentagemNegativos++;
                }

                soma += valores[i];
            }

            
            media = soma / valores.length;
            porcentagemPositivos = porcentagemPositivos / valores.length * 100;
            porcentagemNegativos = porcentagemNegativos / valores.length * 100;

            System.out.println("Maior valor: " + numMaior);
            System.out.println("Menor valor: " + numMenor);
            System.out.println("Soma dos valores valor: " + soma);
            System.out.println("Media: " + media);
            System.out.println("Porcentagem de positivos: " + porcentagemPositivos + "%");
            System.out.println("Porcentagem de negativos: " + porcentagemNegativos + "%");

            do{
                System.out.print("\n\nDeseja executar o programa novamente: ");
                finalizar = scan.nextLine().toUpperCase();

                if(finalizar != "N" && finalizar != "S"){
                    System.out.println("Opção invalida, \"S\" = Sim | \"N\" = Não");
                }
                
            }while(finalizar != "N" && finalizar != "S");

        } while (finalizar == "N");
        scan.close();
    }
}