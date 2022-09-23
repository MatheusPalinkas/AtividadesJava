/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class TP02Form extends JFrame
{  
    private JLabel lblNome, lblIdade, lblEndereco;
    private JTextField txtNome, txtIdade, txtEndereco;
    private JButton btnOk, btnLimpar, btnMostrar, btnSair;
    private JPanel pnlCampos, pnlBotoes;

    private List<Aluno> alunos;

    private final int WIDTH_WINDOW = 400;
    private final int HEIGHT_WINDOW = 180;

    public TP02Form(String title) {
        super(title);

        alunos = new ArrayList<Aluno>();

        configurarLayoutForm();
        instanciarCampos();
        registrarEventos();
        adicionandoCamposPanel();
        
    }

    private void configurarLayoutForm(){
        setLocation(50, 50);
        setSize(WIDTH_WINDOW, HEIGHT_WINDOW);
        setLayout(new BorderLayout(10, 10));
    }

    private void instanciarCampos(){
        lblNome = new JLabel( "Nome: ");
        txtNome = new JTextField(10);

        lblIdade = new JLabel( "Idade: ");
        txtIdade = new JTextField(10);

        lblEndereco = new JLabel( "Endereço: ");
        txtEndereco = new JTextField(10);

        btnOk = new JButton("OK");
        btnLimpar = new JButton("Limpar");
        btnMostrar = new JButton("Mostrar");
        btnSair = new JButton("Sair");
    }

    private void registrarEventos(){
        //Encerrar programa
        addWindowListener(new FecharJanelaAction());
        btnSair.addActionListener(new FecharJanelaAction());

        List<JTextField> campos = new ArrayList<JTextField>();

        campos.add(txtNome);
        campos.add(txtIdade);
        campos.add(txtEndereco);

        btnLimpar.addActionListener(new LimparCamposAction(campos));
        btnOk.addActionListener(new AdicionarAlunoAction(alunos, campos));
        btnMostrar.addActionListener(new MostrarAlunoAction(this, alunos));
    }

    private void adicionandoCamposPanel(){
        pnlCampos = new JPanel();
        pnlCampos.setLayout(new GridLayout(3,2, 10, 10));
        
        pnlCampos.add(lblNome);
        pnlCampos.add(txtNome);

        pnlCampos.add(lblIdade);
        pnlCampos.add(txtIdade);

        pnlCampos.add(lblEndereco);
        pnlCampos.add(txtEndereco);

        pnlBotoes = new JPanel();
        pnlBotoes.setLayout(new GridLayout(1,4, 10, 10));

        pnlBotoes.add(btnOk);
        pnlBotoes.add(btnLimpar);
        pnlBotoes.add(btnMostrar);
        pnlBotoes.add(btnSair); 

        add(pnlCampos, BorderLayout.CENTER);
        add(pnlBotoes, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        TP02Form f = new TP02Form("Trabalho pratico 2");
        f.setVisible(true);
            
    }
}