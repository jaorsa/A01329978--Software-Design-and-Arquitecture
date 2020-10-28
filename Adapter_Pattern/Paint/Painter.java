import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Painter extends JFrame{
    private int pointCount = 0; 
    private Point points[] = new Point[1000];

    public Painter(){
        super("A simple paint program");
        getContentPane().add(new JLabel("Drag the mouse to run"), BorderLayout.SOUTH );
        
        addMouseMotionListener(
            new MouseMotionAdapter(){
                
            }
        );
    }
}