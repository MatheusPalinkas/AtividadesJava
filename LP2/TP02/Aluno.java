/**
 * @author João Paulo e Matheus Palinkas
 */

import java.util.UUID;

public class Aluno {
    protected String endereco;
    protected int idade;
    protected String nome;
    protected UUID uuid;

    public Aluno() {
        this.endereco = "";
        this.idade = 0;
        this.nome = "";
        this.uuid = new UUID(0L, 0L);
    }

    public Aluno(String endereco, int idade, String nome) {
        this.endereco = endereco;
        this.idade = idade;
        this.nome = nome;
        this.uuid = UUID.randomUUID();
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString(){
        return "Id: " + uuid.toString() + " - Nome: " + getNome();
    }
}