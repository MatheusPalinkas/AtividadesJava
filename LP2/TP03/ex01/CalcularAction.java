/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcularAction implements ActionListener
{

    private JTextField campoA;
    private JTextField campoB;
    private JTextField campoSoma;
    private JTextField campoSubtracao;
    private JTextField campoMultiplicacao;
    private JTextField campoDivisao;

    public CalcularAction(JTextField campoA, JTextField campoB) {
        super();

        this.campoA = campoA;
        this.campoB = campoB;
    }

    public CalcularAction setCampoSoma(JTextField campoSoma)
    {
        this.campoSoma = campoSoma;
        return this;
    }

    public CalcularAction setCampoSubtracao(JTextField campoSubtracao)
    {
        this.campoSubtracao = campoSubtracao;
        return this;
    }

    public CalcularAction setCampoMultiplicacao(JTextField campoMultiplicacao)
    {
        this.campoMultiplicacao = campoMultiplicacao;
        return this;
    }

    public CalcularAction setCampoDivisao(JTextField campoDivisao)
    {
        this.campoDivisao = campoDivisao;
        return this;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try {
            double a = Double.parseDouble(campoA.getText());
            double b = Double.parseDouble(campoB.getText());

            if(campoSoma == null)
                throw new Exception("Campo Soma não atribuido a classe CalcularAction");

            if(campoSubtracao == null)
                throw new Exception("Campo Subtracao não atribuido a classe CalcularAction");
            
            if(campoMultiplicacao == null)
                throw new Exception("Campo Multiplicacao não atribuido a classe CalcularAction");

            if(campoDivisao == null)
                throw new Exception("Campo Divisao não atribuido a classe CalcularAction");
                

            campoSoma.setText((a + b) + "");
            campoSubtracao.setText((a - b) + "");
            campoMultiplicacao.setText((a * b) + "");
            campoDivisao.setText((a / b) + "");

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    
}
