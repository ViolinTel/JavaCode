package firstjavabean;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class MainFrame extends JFrame implements ActionListener
{
   JButton button;
   public MainFrame()
   {
    super("�ҵĴ���");
    button = new JButton("�ҵİ�ť");
    button.addActionListener(this);          
    Container con = this.getContentPane();
          con.setLayout(new FlowLayout());
          con.add(button);
          this.setSize(800,600);
          this.setVisible(true);

}
   public void actionPerformed(ActionEvent e)
   {
  if(button == e.getSource())
  {
   JOptionPane.showMessageDialog(null,"��������");
   
  }
   }
 


  public static void main(String[] args )
  {
   MainFrame mainform = new MainFrame();
  }
}