import java.awt.*;
import java.awt.event.*;
class EventHandlerFirst extends Frame implements ActionListener
{
 Button b1,b2,b3,b4;
 Label l1;
 EventHandlerFirst()
 {
 this.setSize(500,500);
 this.setTitle("Event Handling");
 this.setBackground(Color.CYAN);
 this.setVisible(true);
 b1= new Button("Ok");
 b2= new Button("Cencel");
 b3= new Button("Help");
 b4= new Button("Exit");
 b1.setBackground(Color.RED);
 b2.setBackground(Color.PINK);
 b3.setBackground(Color.ORANGE);
 b4.setBackground(Color.green);
 l1= new Label();
 l1.setAlignment(Label.CENTER);
 add(b1,"North");
 add(b2,"South");
 add(b3,"East");
 add(b4,"West");
 add(l1);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
 if(e.getSource()==b1)
 {
 String labeldemo = b1.getLabel();
 l1.setText(labeldemo);
 }
 if(e.getSource() == b2)
 {
 String labeldemo = b2.getLabel();
 l1.setText(labeldemo);
 }
 if(e.getSource() == b3)
 {
 String labeldemo = b3.getLabel();
 l1.setText("Apko Help chahiye !");
 }
 if(e.getSource() == b4)
 {
 System.exit(0);
 }
 }
}
public class EventHandlingDemo 
{
 public static void main(String[] args) {

 EventHandlerFirst e = new
EventHandlerFirst();
 }
}
