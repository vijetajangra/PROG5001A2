import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class VJ_GameBoard extends JPanel {    
    int xcells = 30;   
    int ycells = 30;
    int zcells = 10;       
       
    public VJ_GameBoard() {
        setPreferredSize(new Dimension(xcells * zcells, ycells * zcells));        
        setBackground(Color.black);
        setFocusable(true);        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
}
