import java.awt.Frame ;
import java.awt.Button;
public class ButtonDemo
{
    private ButtonDemo() 
    {
        Frame frame=new Frame("AWT frame and Button");
        Button button=new Button ("I am a Button");
        frame.add(button);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        button.setSize(320,330);
        button.setBounds(65,29,320,240);
        button.setVisible(true);
    }
    public static void main(String args [])
    {
        new ButtonDemo();
    }
}