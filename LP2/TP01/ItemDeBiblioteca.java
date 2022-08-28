/**
 * @author João Paulo e Matheus Palinkas
 */

public interface ItemDeBiblioteca {
    public static final int diasemprestimo = 7;
    

    public boolean getEmprestado();
    public String getLocalizacao();
    public void Empresta();
    public void Devolve();
}