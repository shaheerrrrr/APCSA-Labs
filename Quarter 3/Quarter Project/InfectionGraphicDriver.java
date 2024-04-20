import javax.swing.JFrame;
import java.util.*;

public class InfectionGraphicDriver
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Infection");
        frame.setSize(700, 700);
        frame.setLocation(100, 10);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new RoomPanel());
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
