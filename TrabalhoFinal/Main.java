/**
 * @author João Paulo e Matheus Palinkas
 * Para testar a classe criada siga os passos abaixo respeitando a ordem em que eles serão solicitados:
 
 * Usando a classe AmostraTemperatura instancie o objeto t1 inicializado-o com o construtor AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v);
 * Exiba todas as propriedades de t1;
 * Agora instancie o objeto t2 usando o construtor AmostraTemperatura();
 * Exiba todas as propriedades de t2;
 * Usando os métodos setData(), setHora() e setValor, altere as propriedades de T1;
 * Exiba todas as propriedades de t1 novamente.
 */

public class Main {
    
    public static void main(String[] args){
        AmostraTemperatura t1 = new AmostraTemperatura(4, 9, 2020, 17, 20, 3, 35.5f);

        System.out.println("Propriedades t1\n");
        System.out.println("data: " + t1.getData());
        System.out.println("hora: " + t1.getHora());
        System.out.println("valor: " + t1.getValor());


        AmostraTemperatura t2 = new AmostraTemperatura();

        System.out.println("Propriedades t2\n");
        System.out.println("data: " + t2.getData());
        System.out.println("hora: " + t2.getHora());
        System.out.println("valor: " + t2.getValor());



        System.out.println("Alterando valores do t1\n");

        t1.setData();
        t1.setHora();
        t1.setValor();

        System.out.println("Propriedades t1\n");
        System.out.println("data: " + t1.getData());
        System.out.println("hora: " + t1.getHora());
        System.out.println("valor: " + t1.getValor());

    }
}
