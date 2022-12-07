/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import com.google.gson.Gson;

public class TPFINALForm extends JFrame implements ActionListener
{  
    private JLabel lblNome, lblIdade, lblPeso, lblAltura, lblObjetivo;
    private JTextField txtNome, txtIdade, txtPeso, txtAltura, txtObjetivo;
    private JButton btnIncluir, btnLimpar, btnApresentarDados, btnSair;
    private JPanel pnlCamposInclusao, pnlBotoes;

    private final int WIDTH_WINDOW = 400;
    private final int HEIGHT_WINDOW = 280;

    private AlunoAcademiaRepository _alunoRepository;

    public TPFINALForm(String title) {
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

        _alunoRepository = new AlunoAcademiaRepository();
    }

    private void instanciarCampos(){
        lblNome = new JLabel( "Nome: ");
        txtNome = new JTextField(10);

        lblIdade = new JLabel( "Idade: ");
        txtIdade = new JTextField(10);

        lblPeso = new JLabel( "Peso: ");
        txtPeso = new JTextField(10);

        lblAltura = new JLabel( "Altura: ");
        txtAltura = new JTextField(10);

        lblObjetivo = new JLabel( "Objetivo: ");
        txtObjetivo = new JTextField(10);

        btnIncluir = new JButton("Incluir");
        btnLimpar = new JButton("Limpar");
        btnApresentarDados = new JButton("Apresentar");
        btnSair =  new JButton("Sair");
    }

    private void registrarEventos(){
        //Encerrar programa
        addWindowListener(new SairAction());   
        btnSair.addActionListener(new SairAction());

        List<JTextComponent> campos = new ArrayList<JTextComponent>();

        campos.add(txtNome);
        campos.add(txtIdade);
        campos.add(txtPeso);
        campos.add(txtAltura);
        campos.add(txtObjetivo);

        btnLimpar.addActionListener(new LimparCamposAction(campos));
        btnApresentarDados.addActionListener(this);
        btnIncluir.addActionListener(this);
    }

    private void adicionandoCamposPanel(){

        pnlCamposInclusao = new JPanel();
        pnlCamposInclusao.setLayout(new GridLayout(5, 2));

        pnlCamposInclusao.add(lblNome);
        pnlCamposInclusao.add(txtNome);

        pnlCamposInclusao.add(lblIdade);
        pnlCamposInclusao.add(txtIdade);

        pnlCamposInclusao.add(lblPeso);
        pnlCamposInclusao.add(txtPeso);

        pnlCamposInclusao.add(lblAltura);
        pnlCamposInclusao.add(txtAltura);

        pnlCamposInclusao.add(lblObjetivo);
        pnlCamposInclusao.add(txtObjetivo);

        pnlBotoes = new JPanel();
        pnlBotoes.setLayout(new GridLayout(1, 4));

        pnlBotoes.add(btnIncluir);
        pnlBotoes.add(btnLimpar);
        pnlBotoes.add(btnApresentarDados);
        pnlBotoes.add(btnSair);
  
        // add(pnlCamposInclusao, BorderLayout.NORTH);
        add(pnlCamposInclusao, BorderLayout.CENTER);
        add(pnlBotoes, BorderLayout.SOUTH);
    }

    //#region Actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnApresentarDados) apresentarDados();
        if(e.getSource() == btnIncluir) incluir();
    }

    private void apresentarDados(){
        AlunoAcademia aluno = getAlunoCampos();

        Gson gson = new Gson();

        JOptionPane.showMessageDialog (this, gson.toJson(aluno));
    }

    private void incluir(){
        AlunoAcademia aluno = getAlunoCampos();

        Boolean adicionado = _alunoRepository.postAlunoAcademia(aluno);

        if(adicionado)
            JOptionPane.showMessageDialog (this, "Aluno adicionado com sucesso!");
        else
            JOptionPane.showMessageDialog (null, "Erro ao incluir aluno");
    }

    private AlunoAcademia getAlunoCampos(){
        AlunoAcademia aluno = new AlunoAcademia();

        aluno.setNome(txtNome.getText());        
        aluno.setObjetivo(txtObjetivo.getText());        
        aluno.setIdade(txtIdade.getText().trim().isEmpty()? 0 : Integer.parseInt(txtIdade.getText()));
        aluno.setPeso(txtPeso.getText().trim().isEmpty() ? 0 : Float.parseFloat(txtPeso.getText()));
        aluno.setAltura(txtAltura.getText().trim().isEmpty() ? 0 : Float.parseFloat(txtAltura.getText()));

        return aluno;
    }
    //#endregion
    public static void main(String[] args) {
        TPFINALForm f = new TPFINALForm("TRABALHO FINAL");
        f.setVisible(true);       
    }
}