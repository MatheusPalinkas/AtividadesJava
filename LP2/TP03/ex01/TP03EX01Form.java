/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class TP03EX01Form extends JFrame
{  
    private JLabel lblA, lblB, lblSoma, lblSubtracao, lblMultiplicacao, lblDivisao;
    private JTextField txtA, txtB, txtSoma, txtSubtracao, txtMultiplicacao, txtDivisao;
    private JButton btnCalcular, btnLimpar, btnSair;
    private JPanel pnlCampos, pnlBotoes;

    private final int WIDTH_WINDOW = 400;
    private final int HEIGHT_WINDOW = 280;

    public TP03EX01Form(String title) {
        super(title);

        configurarLayoutForm();
        instanciarCampos();
        desabilitarCamposApenasLeitura();
        registrarEventos();
        adicionandoCamposPanel();
        
    }

    private void configurarLayoutForm(){
        setLocation(50, 50);
        setSize(WIDTH_WINDOW, HEIGHT_WINDOW);
        setLayout(new BorderLayout(10, 10));
    }

    private void instanciarCampos(){
        lblA = new JLabel( "A: ");
        txtA = new JTextField(10);

        lblB = new JLabel( "B: ");
        txtB = new JTextField(10);

        lblSoma = new JLabel( "Soma: ");
        txtSoma = new JTextField(10);

        lblSubtracao = new JLabel( "Subtracao: ");
        txtSubtracao = new JTextField(10);

        lblMultiplicacao = new JLabel( "Multiplicacao: ");
        txtMultiplicacao = new JTextField(10);

        lblDivisao = new JLabel( "Divisao: ");
        txtDivisao = new JTextField(10);

        btnLimpar = new JButton("Limpar");
        btnCalcular = new JButton("Calcular");
        btnSair = new JButton("Sair");
    }

    private void desabilitarCamposApenasLeitura(){
        txtSoma.setEditable(false);
        txtSubtracao.setEditable(false);
        txtMultiplicacao.setEditable(false);
        txtDivisao.setEditable(false);
    }

    private void registrarEventos(){
        //Encerrar programa
        addWindowListener(new SairAction());
        btnSair.addActionListener(new SairAction());

        List<JTextField> campos = new ArrayList<JTextField>();

        campos.add(txtA);
        campos.add(txtB);
        campos.add(txtSoma);
        campos.add(txtSubtracao);
        campos.add(txtMultiplicacao);
        campos.add(txtDivisao);

        btnLimpar.addActionListener(new LimparAction(campos));

        CalcularAction calcularAction = new CalcularAction(txtB, txtA)
                                                .setCampoSoma(txtSoma)
                                                .setCampoSubtracao(txtSubtracao)
                                                .setCampoMultiplicacao(txtMultiplicacao)
                                                .setCampoDivisao(txtDivisao);

        btnCalcular.addActionListener(calcularAction);
        
    }

    private void adicionandoCamposPanel(){
        pnlCampos = new JPanel();
        pnlCampos.setLayout(new GridLayout(6,2, 0, 0));
        
        pnlCampos.add(lblA);
        pnlCampos.add(txtA);

        pnlCampos.add(lblB);
        pnlCampos.add(txtB);

        pnlCampos.add(lblSoma);
        pnlCampos.add(txtSoma);

        pnlCampos.add(lblSubtracao);
        pnlCampos.add(txtSubtracao);

        pnlCampos.add(lblMultiplicacao);
        pnlCampos.add(txtMultiplicacao);

        pnlCampos.add(lblDivisao);
        pnlCampos.add(txtDivisao);

        pnlBotoes = new JPanel();
        pnlBotoes.setLayout(new GridLayout(1,4, 10, 10));

        pnlBotoes.add(btnLimpar);
        pnlBotoes.add(btnCalcular);
        pnlBotoes.add(btnSair); 

        add(pnlCampos, BorderLayout.CENTER);
        add(pnlBotoes, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        TP03EX01Form f = new TP03EX01Form("Semana 4 - Exercicio 4");
        f.setVisible(true);          
    }
}