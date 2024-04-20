//Rev Dr Douglas R Oberle, W.T. Woodson

/* Shaheer Khan
 * On my Honor as a Student, I have not received aid on this lab
 */

import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class ScaleMutatorDriver								   //Driver Program
{
   public static ScaleMutatorPanel screen;					//Panel window

   public static void main(String[]args)
   {
      screen = new ScaleMutatorPanel();
      JFrame frame = new JFrame("The Great Scale Mutator");	//window title
      frame.setSize(screen.getScreenWidth() + 25, 648);	   //size of game window
      frame.setLocation(100, 50);				               //location of game window on the screen
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(screen);		
      frame.setVisible(true);
      frame.addKeyListener(new listen());		               //Get input from the keyboard
   }

   private static boolean shiftIsPressed=false; 

   public static class listen implements KeyListener 
   {
      public void keyTyped(KeyEvent e)
      {}
   
      public void keyPressed(KeyEvent e)
      {
         if(e.getKeyCode()==KeyEvent.VK_SHIFT)
            shiftIsPressed=true;
         screen.processUserInput(e.getKeyCode(), shiftIsPressed);
      }
   
      public void keyReleased(KeyEvent e)
      {
         if(e.getKeyCode()==KeyEvent.VK_SHIFT)
            shiftIsPressed=false;
      }
   }
}
