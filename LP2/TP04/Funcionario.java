/**
 * @author João Paulo e Matheus Palinkas
 */

public class Funcionario
{
    private int codigo;
    private String nome;
    private double salario;
    private Cargo cargo;

    public Funcionario(int codigo, String nome, double salario, Cargo cargo){
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public String getCargo(){
        return this.cargo.getCargo();
    }
}
