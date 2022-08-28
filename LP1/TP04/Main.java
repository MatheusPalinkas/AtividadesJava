/**
 * @author João Paulo e Matheus Palinkas
 * Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no exercício anterior.
 */

public class Main {
    public static void main(String[] args){
        Data noamChomsky = new Data(7, 12, 1928);
        Data joao = new Data(27, 5, 2003);
        
        System.out.println("Noam Chomsky\n");
        System.out.println("Mostra data 1: " + noamChomsky.mostra1());
        System.out.println("Mostra data 2: " + noamChomsky.mostra2());
        System.out.println("Ano é bissexto: " + noamChomsky.bissexto());
        System.out.println("Dias transcorridos: " + noamChomsky.diasTranscorridos());
        noamChomsky.apresentaDataAtual();
        System.out.println("\n\n");

        System.out.println("Joao\n");
        System.out.println("Mostra data 1: " + joao.mostra1());
        System.out.println("Mostra data 2: " + joao.mostra2());
        System.out.println("Ano é bissexto: " + joao.bissexto());
        System.out.println("Dias transcorridos: " + joao.diasTranscorridos());
        joao.apresentaDataAtual();
        System.out.println("\n\n");
    }
}
