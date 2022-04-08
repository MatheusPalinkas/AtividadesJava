import java.util.Scanner;

/**
 * @author João Paulo e Matheus Palinkas
 * 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
 */

public class TP01Ex18 {
    
    public static void main(String[] args){
        float valorProduto1, valorProduto2, valorProduto3, valorProduto4, valorProduto5;
		float pagamento, troco;
		Scanner scan = new Scanner(System.in);
        
    	System.out.print("Entre com o valor do 1º produto: ");
    	valorProduto1 = scan.nextFloat();

		System.out.print("Entre com o valor do 2º produto: ");
    	valorProduto2 = scan.nextFloat();

		System.out.print("Entre com o valor do 3º produto: ");
    	valorProduto3 = scan.nextFloat();

		System.out.print("Entre com o valor do 4º produto: ");
    	valorProduto4 = scan.nextFloat();

		System.out.print("Entre com o valor do 5º produto: ");
    	valorProduto5 = scan.nextFloat();

		System.out.print("Entre com o valor do pagamento: ");
    	pagamento = scan.nextFloat();

		troco = pagamento - (valorProduto1 + valorProduto2 + valorProduto3 + valorProduto4 + valorProduto5);

    	System.out.println("O troco a ser devoldido é de " + troco);
    }
}