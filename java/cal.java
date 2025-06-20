import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener{
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField txt1;
    JTextField txt2;
    JTextField txt3;
    JButton bt1;
    JButton bt2;
    JButton bt3;
    JButton bt4;
    JFrame frame;

    public void MyFrame1(){
        
        // Error here.. Frame must be decalred only outside
        //Frame frame = new JFrame("Calculator"); // wrong
        frame=new JFrame("Calculator"); // right (only initialize here)
        frame.setLayout(null);
        frame.setBounds(200,150,500,400);

        JLabel label1=new JLabel("Enter number one ");
        label1.setBounds(50,40,150,100);
        label1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        frame.add(label1);

        JLabel label2=new JLabel("Enter number two");
        label2.setBounds(50,90,150,100);
        label2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        frame.add(label2);

        JLabel label3=new JLabel("Result");
        label3.setBounds(65,200,150,150);
        label3.setFont(new Font("Times New Roman",Font.BOLD,30));
        frame.add(label3);

        txt1=new JTextField();
        txt1.setBounds(200,75,150,30);
        frame.add(txt1);

        txt2=new JTextField();
        txt2.setBounds(200,125,150,30);
        frame.add(txt2);

        txt3=new JTextField();
        txt3.setBounds(200,255,150,40);
        frame.add(txt3);

        bt1=new JButton("+");
        bt1.setBounds(120,200,50,35);
        bt1.setBackground(Color.GREEN);
        bt1.setFont(new Font("Times New Roman",Font.BOLD,20));
        bt1.addActionListener(this); // add action listener is compulsory
        frame.add(bt1);

        bt2=new JButton("-");
        bt2.setBounds(160,200,50,35);
        bt2.setBackground(Color.GREEN);
        bt2.setFont(new Font("Times New Roman",Font.BOLD,20));
        bt2.addActionListener(this);
        frame.add(bt2);

        bt3=new JButton("*");
        bt3.setBounds(200,200,50,35);
        bt3.setBackground(Color.GREEN);
        bt3.setFont(new Font("Times New Roman",Font.BOLD,20));
        bt3.addActionListener(this);
        frame.add(bt3);

        bt4=new JButton("/");
        bt4.setBounds(240,200,50,35);
        bt4.setBackground(Color.GREEN);
        bt4.setFont(new Font("Times New Roman",Font.BOLD,20));
        bt4.addActionListener(this);
        frame.add(bt4);

        frame.setVisible(true);


    }
    public void actionPerformed(ActionEvent e) {
        try{
            Double a= Double.parseDouble(txt1.getText().trim());
            Double b= Double.parseDouble(txt2.getText().trim());
            if(e.getSource()==bt1){
                txt3.setText(String.valueOf(a+b));
            }
            if(e.getSource()==bt2){
                txt3.setText(String.valueOf(a-b));
            }
            if(e.getSource()==bt3){
                txt3.setText(String.valueOf(a*b));
            }
            if(e.getSource()==bt4){
                txt3.setText(String.valueOf(a/b));
            }
        } catch (Exception ae){
            JOptionPane.showMessageDialog(frame, "invalid Input");
        }
    }
}

public class cal {
    public static void main (String[] arg){
        new MyFrame();
    }

}
