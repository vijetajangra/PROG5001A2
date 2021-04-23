import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GameBoard extends JPanel {    
    int xcells = 30;   
    int ycells = 30;
    int zcells = 10;       
       
    public GameBoard() {
        setPreferredSize(new Dimension(xcells * zcells, ycells * zcells));        
        setBackground(Color.black);
        setFocusable(true);        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
}
