/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class TP03EX02Form
    extends JFrame
    implements ActionListener
{  
    private JLabel lblTitulo, lblAutor, lblEditora, lblAnoEdicao, lblLocalizacao, lblStatus;
    private JTextField txtTitulo, txtAutor, txtEditora, txtAnoEdicao, txtLocalizacao, txtStatus;
    private JButton btnOk, btnEmprestar, btnDevolver, btnMostrar, btnSair;
    private JPanel pnlCampos, pnlBotoes;

    private LivroDeBiblioteca livro;

    private final int WIDTH_WINDOW = 500;
    private final int HEIGHT_WINDOW = 280;

    public TP03EX02Form(String title) {
        super(title);

        livro = new LivroDeBiblioteca("Java", "Mauricio", "LTC", (short)2005, "a1b1");

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

        btnOk.addActionListener(this);
        btnEmprestar.addActionListener(this);
        btnDevolver.addActionListener(this);
        btnMostrar.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        
    
        if(e.getSource() == btnMostrar){
            mostrarAction();
        }else if(e.getSource() == btnOk){
            salvarDadosAction();
        }
        else if(e.getSource() == btnEmprestar){
            emprestarAction();
        }
        else if(e.getSource() == btnDevolver){
            devolerAction();
        }
        
    }

    private void emprestarAction(){
        livro.Empresta();
    }

    private void devolerAction(){
        livro.Devolve();
    }

    private void mostrarAction(){
        txtTitulo.setText(livro.getTitulo());
        txtAutor.setText(livro.getAutor());
        txtEditora.setText(livro.getEditora());
        txtAnoEdicao.setText(livro.getAnoEdicao() + "");
        txtLocalizacao.setText(livro.getLocalizacao());
        txtStatus.setText(livro.getEmprestado() + "");
    }

    private void salvarDadosAction(){
        LivroDeBiblioteca novoLivro = new LivroDeBiblioteca(
            txtTitulo.getText(),
            txtAutor.getText(),
            txtEditora.getText(),
            Short.parseShort(txtAnoEdicao.getText()),
            txtLocalizacao.getText()
        );

        livro = novoLivro;

        limparCampos();
    }

    private void limparCampos(){
        List<JTextField> campos = new ArrayList<JTextField>();

        campos.add(txtTitulo);
        campos.add(txtAutor);
        campos.add(txtEditora);
        campos.add(txtAnoEdicao);
        campos.add(txtLocalizacao);
        campos.add(txtStatus);

        for (JTextField jTextField : campos) {
            jTextField.setText("");
        }
    }
}