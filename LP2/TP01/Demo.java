/**
 * @author João Paulo e Matheus Palinkas
 */

public class Demo {
    
    public static void main(String[] args){        
        LivroDeBiblioteca L1 = new LivroDeBiblioteca("Introdução à POO usando JAVA", "Prof. Rafael Santos", "Campus/SBC", (short)2003, "g11p17");

        System.out.println(L1.getDados());
        System.out.println();

        if(!L1.getEmprestado()){
            L1.Empresta();
            System.out.println("O livro " + L1.getTitulo() + " foi emprestado com sucesso!\nDevera ser devolvido em " + L1.diasemprestimo + " dias.");
        }else{
            System.out.println("O livro " + L1.getTitulo() + " não está disponivel para emprestimo");
        }

        System.out.println();
        
        if(!L1.getEmprestado()){
            L1.Empresta();
            System.out.println("O livro " + L1.getTitulo() + " foi emprestado com sucesso!\nDevera ser devolvido em " + LivroDeBiblioteca.diasemprestimo + " dias.");
        }else{
            System.out.println("O livro " + L1.getTitulo() + " não está disponivel para emprestimo");
        }
    }
}