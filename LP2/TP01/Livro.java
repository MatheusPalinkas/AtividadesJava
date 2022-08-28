/**
 * @author João Paulo e Matheus Palinkas
 */

public class Livro {
    protected String titulo;
    protected String autor;
    protected String editora;
    protected short anoedicao;

    public Livro(String titulo, String autor, String editora, short anoedicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoedicao = anoedicao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setAnoEdicao(short anoedicao) {
        this.anoedicao = anoedicao;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getEditora(){
        return this.editora;
    }
    public short getAnoEdicao(){
        return this.anoedicao;
    }
    public String getDados(){
        return "\nTitulo = "+ this.titulo + 
               "\nAutor = " + this.autor +
               "\nEditora = " + this.editora +
               "\nAno = " + this.anoedicao;
    }
}