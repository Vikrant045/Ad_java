import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;


//import javax.swing.Action;
import java.awt.event.*;

public class firstAwt extends Frame implements ActionListener{
    Button b1,b2;   
    TextField t1,t2,t3;
    Label l1,l2,l3;
    firstAwt(){
        Frame f = new Frame("First_AWT");

       
        f.setLayout(new FlowLayout());
        //f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
      // f.pack();
f.setLocation(400,200);
        f.setVisible(true);
        f.setSize(300,300);
        l1 = new Label("Enter 1st no : ");
        l1.setBackground(Color.MAGENTA);
        t1 = new TextField(15);
        t1.setBackground(Color.BLUE);

        f.add(l1);
        f.add(t1);
       

        l2 = new Label(" Enter 2nd no : ");
        l2.setBackground(Color.MAGENTA);

        t2 = new TextField(15);
        t2.setBackground(Color.BLUE);

        f.add(l2);
        f.add(t2);
        l3 = new Label(" Result : ");
        l3.setBackground(Color.MAGENTA);

        t3 = new TextField(10);
        t3.setBackground(Color.BLUE);

        f.add(l3);
        f.add(t3);



        b1= new Button("Add");
        b1.setBackground(Color.green);
        b1.addActionListener(this);

        f.add(b1);
        b2= new Button("Sub");
        b2.setBackground(Color.green);
        b2.addActionListener(this);

        f.add(b2);
    }
    public static void main(String args[]){

        firstAwt a = new firstAwt();

      
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //TextComponent t1;
        String s1 =t1.getText();
        String s2 = t2.getText();

        if(s1.isEmpty()|| s2.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter numbers");

        }
        else{
             double d1 = Double.parseDouble(s1);
             double d2 = Double.parseDouble(s2);
             if(e.getSource()==b1){
             double d3 = d1+d2;

                t3.setText(""+d3);
        }
        else{
            double d4 = d1-d2;
            t3.setText(""+d4);
        }
        

    }

   
}
}
