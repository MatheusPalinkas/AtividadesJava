/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.*;
import java.util.*;
import java.util.List;
import java.awt.event.*; 

import javax.swing.*;

public class TP04Form extends JFrame  implements ActionListener
{  
    private JLabel lblNomePesquisa, lblNome, lblSalario, lblCargo;
    private JTextField txtNomePesquisa, txtNome, txtSalario, txtCargo;
    private JButton btnPesquisar, btnAnterior, btnProximo;
    private JPanel pnlPesquisa, pnlPesquisaCampo, pnlCampos, pnlBotoes;

    private final int WIDTH_WINDOW = 400;
    private final int HEIGHT_WINDOW = 280;

    private ArrayList<Funcionario> funcionarios;
    private FuncionarioRepository funcionarioRepository;
    private int indexFuncionario;

    public TP04Form(String title) {
        super(title);

        configurarLayoutForm();
        instanciarCampos();
        desabilitarCamposApenasLeitura();
        registrarEventos();
        adicionandoCamposPanel();

        funcionarios = new ArrayList<Funcionario>();
        funcionarioRepository = new FuncionarioRepository();
        indexFuncionario = 0;
        
    }

    private void configurarLayoutForm(){
        setLocation(50, 50);
        setSize(WIDTH_WINDOW, HEIGHT_WINDOW);
        setLayout(new BorderLayout(10, 10));
    }

    private void instanciarCampos(){
        lblNomePesquisa = new JLabel( "Nome: ");
        txtNomePesquisa = new JTextField(20);

        lblNome = new JLabel( "Nome: ");
        txtNome = new JTextField(10);

        lblSalario = new JLabel( "Salário: ");
        txtSalario = new JTextField(10);

        lblCargo = new JLabel( "Cargo: ");
        txtCargo = new JTextField(10);

        btnPesquisar = new JButton("Pesquisar");
        btnAnterior = new JButton("Anterior");
        btnProximo = new JButton("Próximo");
    }

    private void desabilitarCamposApenasLeitura(){
        txtNome.setEditable(false);
        txtSalario.setEditable(false);
        txtCargo.setEditable(false);
    }

    private void registrarEventos(){
        //Encerrar programa
        addWindowListener(new SairAction());   


        btnPesquisar.addActionListener(this);
        btnAnterior.addActionListener(this);
        btnProximo.addActionListener(this);
    }

    private void adicionandoCamposPanel(){
        
        pnlPesquisaCampo = new JPanel();
        pnlPesquisaCampo.setLayout(new FlowLayout(FlowLayout.CENTER));

        pnlPesquisaCampo.add(lblNomePesquisa);
        pnlPesquisaCampo.add(txtNomePesquisa);

        pnlPesquisa = new JPanel();
        pnlPesquisa.setLayout(new GridLayout(2, 1));

        pnlPesquisa.add(pnlPesquisaCampo);
        pnlPesquisa.add(btnPesquisar);

        pnlCampos = new JPanel();
        pnlCampos.setLayout(new GridLayout(3, 2, 10, 10));

        pnlCampos.add(lblNome);
        pnlCampos.add(txtNome);

        pnlCampos.add(lblCargo);
        pnlCampos.add(txtCargo);

        pnlCampos.add(lblSalario);
        pnlCampos.add(txtSalario);

        pnlBotoes = new JPanel();
        pnlBotoes.setLayout(new GridLayout(1, 2, 0, 0));

        pnlBotoes.add(btnAnterior);
        pnlBotoes.add(btnProximo);

        add(pnlPesquisa, BorderLayout.NORTH);
        add(pnlCampos, BorderLayout.CENTER);
        add(pnlBotoes, BorderLayout.SOUTH);
    }

    //#region   Actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnPesquisar){
            pesquisar();
        }

        if(e.getSource() == btnAnterior){
            anterior();
        }

        if(e.getSource() == btnProximo){
            proximo();
        }
        
    }
    
    private void pesquisar(){
        indexFuncionario = 0;
        funcionarios = funcionarioRepository.getFuncionarios(txtNomePesquisa.getText());

        if(funcionarios.size() <= 0)
        {
            JOptionPane.showMessageDialog(null, "Não foram encontrados funcionarios com esse nome");
            return;
        }
        
        txtNomePesquisa.setText("");
        setFuncionarioCampos();
    }

    private void anterior(){
        if(indexFuncionario - 1 < 0){
            JOptionPane.showMessageDialog(null, "Listagem já chegou ao inicio");
            return;
        }
        
        indexFuncionario--;
        setFuncionarioCampos();
    }

    private void proximo(){
        if(indexFuncionario  + 1 >= funcionarios.size()){
            JOptionPane.showMessageDialog(null, "Listagem já chegou ao final");
            return;
        }


        indexFuncionario++;
        setFuncionarioCampos();
    }

    private void setFuncionarioCampos(){
        Funcionario funcionario = funcionarios.get(indexFuncionario);

        txtNome.setText(funcionario.getNome());
        txtSalario.setText(funcionario.getSalario() + "");
        txtCargo.setText(funcionario.getCargo());

    }

    //#endregion
    public static void main(String[] args) {
        TP04Form f = new TP04Form("TRABALHO PRATICO 04");
        f.setVisible(true);       
    }
}