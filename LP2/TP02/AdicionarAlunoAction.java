/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.event.*;
import java.util.*;

import javax.swing.JTextField;;

public class AdicionarAlunoAction implements ActionListener{

    private List<Aluno> alunos;
    private List<JTextField> campos;

    private final int INDEX_NOME = 0;
    private final int INDEX_IDADE = 1;
    private final int INDEX_ENDERECO = 2;

    public AdicionarAlunoAction(List<Aluno> listAlunos, List<JTextField> listCampos) {
        super();

        alunos = listAlunos;
        campos = listCampos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = campos.get(INDEX_NOME).getText();
        String endereco = campos.get(INDEX_ENDERECO).getText();
        int idade = Integer.parseInt(campos.get(INDEX_IDADE).getText());

        Aluno aluno = new Aluno(endereco, idade, nome);
        alunos.add(aluno);

        new LimparCamposAction(campos).actionPerformed(e);
    }

}
