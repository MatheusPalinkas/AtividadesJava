<<<<<<< HEAD
package TP01;
import java.util.Scanner;

/**
 * @author João Paulo, Mateus Palinkas.
 * 
 * 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
 * valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco 
 * que deverá ser devolvido.
 */
public class TP01Ex18 {

	public static void main(String[] args) {
		double produto1, produto2, produto3, produto4, produto5, pagamento, total, troco;
		Scanner scan = new Scanner(System.in);

    System.out.print("Entre com o valor do primeiro produto: ");
		produto1 = scan.nextDouble();

		System.out.print("Entre com o valor do segundo produto: ");
		produto2 = scan.nextDouble();

		System.out.print("Entre com o valor do terceiro produto: ");
		produto3 = scan.nextDouble();
    
		System.out.print("Entre com o valor do quarto produto: ");
		produto4 = scan.nextDouble();

		System.out.print("Entre com o valor do quinto produto: ");
		produto5 = scan.nextDouble();

    System.out.print("Entre com o valor do pago pelo cliente: ");
		pagamento = scan.nextDouble();

    total = produto1 + produto2 + produto3 + produto4 + produto5;

    troco = pagamento - total;

		System.out.println("O valor do troco é: " + troco);
	}

=======
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
>>>>>>> 2fa158d8db13403a9b2c3ce42aa17e2dbbc31937
}