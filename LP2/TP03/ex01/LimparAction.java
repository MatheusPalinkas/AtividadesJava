/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.event.*;
import java.util.*;
import javax.swing.JTextField;

public class LimparAction implements ActionListener{

    private List<JTextField> campos;

    public LimparAction(List<JTextField> arrayCampos) {
        super();

        campos = arrayCampos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (JTextField jTextField : campos) {
            jTextField.setText("");
        }
    }
    
}
