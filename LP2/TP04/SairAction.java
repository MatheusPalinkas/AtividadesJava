/**
 * @author João Paulo e Matheus Palinkas
 */

import java.awt.event.*;

public class SairAction
    extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
