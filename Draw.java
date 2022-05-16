import java.awt.Color; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel; 
  
public class Draw extends JPanel implements Runnable, KeyListener {
  private int[][] x = new int[6][5];
  private int[][] y = new int[6][5];
  private int width = 65;
  private int height = 65;
  private String[][] wordArray = new String[6][5];
  private String[] guess = {"B", "R", "A", "I", "N"};
  private int numGuess = 1; // has to start at 0
  private String[][] colours = 
    
  public Draw() {
    Thread thread = new Thread();
    thread.start();
  }

  public void paintComponent(Graphics g2) {
    super.paintComponent(g2);
    Graphics2D g = (Graphics2D) g2;

    g.setFont(new Font("Arial", Font.PLAIN, 70));
    g.drawString("Garble", 190, 77);

    for (int row = 0; row < x.length; row++) {
      for (int col = 0; col < x[0].length; col++) {
          x[row][col] = 125 + (75 * col);
      }
    }

    for (int col = 0; col < y[0].length; col++) {
      for (int row = 0; row < y.length; row++) {
          y[row][col] = 110 + (75 * row);
      }
    }

    for (int row = 0; row < x.length; row++) {
      for (int col = 0; col < x[0].length; col++) {
        g.drawRect(x[row][col], y[row][col], width, height);
      }
    }

    for (int i = 0; i < 5; i++) {
      for (int row = 0; row < x.length; row++) {
        for (int col = 0; col < x[0].length; col++) {
          wordArray[numGuess][i] = guess[i];
        }
      }
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
