/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.event.*;
import java.util.*;
import javax.swing.text.JTextComponent;

public class LimparCamposAction implements ActionListener{

    private List<JTextComponent> campos;

    public LimparCamposAction(List<JTextComponent> arrayCampos) {
        super();

        campos = arrayCampos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (JTextComponent jTextComponent : campos) {
            jTextComponent.setText("");
        }
    }
    
}
