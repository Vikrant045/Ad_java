import java.awt.Color;

import javax.swing.*;
public class learnSwing {
    public static void main(String args[]){

        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.BLACK);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(420,420);
        ImageIcon img = new ImageIcon("vcrop.jpeg");
        jf.setIconImage(img.getImage());
    }
    
}
