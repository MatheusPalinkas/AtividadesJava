/**
 * @author João Paulo e Matheus Palinkas
 */

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean emprestado;
    private String localizacao;

    public LivroDeBiblioteca(String titulo, String autor, String editora, short anoedicao, String localizacao) {
        super(titulo, autor, editora, anoedicao);
        this.localizacao = localizacao;
        this.emprestado = false;
    }

    public boolean getEmprestado(){
        return this.emprestado;
    }
    public String getLocalizacao(){
        return this.localizacao;
    }
    public void Empresta(){
        this.emprestado = true;
    }
    public void Devolve(){
        this.emprestado = false;
    }
    public String getDados(){
        return super.getDados() +
            "\nLocalizacao = " + this.localizacao;
    }
}