/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class TP03EX02Form extends JFrame
{  
    private JLabel lblTitulo, lblAutor, lblEditora, lblAnoEdicao, lblLocalizacao, lblStatus;
    private JTextField txtTitulo, txtAutor, txtEditora, txtAnoEdicao, txtLocalizacao, txtStatus;
    private JButton btnOk, btnEmprestar, btnDevolver, btnMostrar, btnSair;
    private JPanel pnlCampos, pnlBotoes;

    private final int WIDTH_WINDOW = 500;
    private final int HEIGHT_WINDOW = 280;

    public TP03EX02Form(String title) {
        super(title);

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
        lblTitulo = new JLabel( "Titulo: ");
        txtTitulo = new JTextField(10);

        lblAutor = new JLabel( "Autor: ");
        txtAutor = new JTextField(10);

        lblEditora = new JLabel( "Editora: ");
        txtEditora = new JTextField(10);

        lblAnoEdicao = new JLabel( "Ano Edicao: ");
        txtAnoEdicao = new JTextField(10);

        lblLocalizacao = new JLabel( "Localizacao: ");
        txtLocalizacao = new JTextField(10);

        lblStatus = new JLabel( "Status: ");
        txtStatus = new JTextField(10);

        btnOk = new JButton("OK");
        btnEmprestar = new JButton("Emprestar");
        btnDevolver = new JButton("Devolver");
        btnMostrar = new JButton("Mostrar");
        btnSair = new JButton("Sair");
    }

    private void registrarEventos(){
        //Encerrar programa
        addWindowListener(new SairAction());
        btnSair.addActionListener(new SairAction());

        List<JTextField> campos = new ArrayList<JTextField>();

        campos.add(txtTitulo);
        campos.add(txtAutor);
        campos.add(txtEditora);
        campos.add(txtAnoEdicao);
        campos.add(txtLocalizacao);
        campos.add(txtStatus);
    }

    private void adicionandoCamposPanel(){
        pnlCampos = new JPanel();
        pnlCampos.setLayout(new GridLayout(6,2, 0, 0));
        
        pnlCampos.add(lblTitulo);
        pnlCampos.add(txtTitulo);

        pnlCampos.add(lblAutor);
        pnlCampos.add(txtAutor);

        pnlCampos.add(lblEditora);
        pnlCampos.add(txtEditora);

        pnlCampos.add(lblAnoEdicao);
        pnlCampos.add(txtAnoEdicao);

        pnlCampos.add(lblLocalizacao);
        pnlCampos.add(txtLocalizacao);

        pnlCampos.add(lblStatus);
        pnlCampos.add(txtStatus);

        pnlBotoes = new JPanel();
        pnlBotoes.setLayout(new GridLayout(1,5));

        pnlBotoes.add(btnOk);
        pnlBotoes.add(btnEmprestar);
        pnlBotoes.add(btnDevolver);
        pnlBotoes.add(btnMostrar);
        pnlBotoes.add(btnSair); 

        add(pnlCampos, BorderLayout.CENTER);
        add(pnlBotoes, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        TP03EX02Form f = new TP03EX02Form("Semana 4 - Exercicio 4");
        f.setVisible(true);
            
    }
}