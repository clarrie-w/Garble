import java.awt.Color; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel; 
  
public class Draw extends JPanel implements Runnable, KeyListener {
  
  public Draw() {
    Thread thread = new Thread();
    thread.start();
  }
  
  public void paintComponent(Graphics g2) {
    super.paintComponent(g2);
    Graphics2D g = (Graphics2D) g2;

    g.setFont(new Font("Arial", Font.PLAIN, 70));
    g.drawString("Garble", 190, 77);
    int x = 125;
    int y = 110;
    for(int i = 0; i <= 5; i++){
      for(int j = 0; j < 5; j++){
        g.drawRect(x, y, 65, 65);
        x += 75;
      }
      y += 75;
      x = 125;
    }
  }

  /* (pseudocode for changing background colour of square for guess)
  for (every letter in word)
  {
    for (every letter in guess)
    {
      if (letter in guess is in right word and right index)
      {
        green square; (R: 119 G: 198 B: 110 hex: #77C66E)
      }
      else if (letter in guess is in word but not in the right spot)
      {
        yellow square; (R: 252 G: 247 B: 135 hex: #fcf787 )
      }
      else // letter in guess not in word
      {
        gray square; (R: 142 G: 142 B: 142 hex: #8E8E8E)
      }
    }  
  }
  */

  // Updates the screen
  @Override 
  public void run() {
    while(true){
      repaint(); 
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    if (key == KeyEvent.VK_W)
    {
      System.out.println("Pressing w");
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }
}
