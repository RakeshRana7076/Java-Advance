import java.awt.*;
public class AwtEx
{
    AwtEx()
    {
        Frame fr1=new Frame();
        Label la=new Label("Welcome to Graphics");
        fr1.add(la);
        fr1.setSize(200,200);
        fr1.setVisible(true);
        la.setBounds(258, 320, 402, 265);
        la.setBackground(Color.CYAN);
    }
    public static void main(String[] args)
    {
        AwtEx aw=new AwtEx();
    }
}