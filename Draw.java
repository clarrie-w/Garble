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
    Game game = new Game();

    Row row0 = new Row(0);
    Row row1 = new Row(1);
    Row row2 = new Row(2);
    Row row3 = new Row(3);
    Row row4 = new Row(4);
    Row[] rows = {row0, row1, row2, row3, row4};
    
    int rowsIndex = game.getNumGuesses();
    UserWord guess = new UserWord();
    GenerateWord generatedWord = new GenerateWord();

    rows[rowsIndex].setUserWordArray(guess.getUserInput());
    guess.setLetterColours(generatedWord.getWord(), rows[rowsIndex].getUserWordArray());
    rows[rowsIndex].setColours(guess.getLetterColours());

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

    for (int i = 0; i < 5; i++) {
      if (rows[rowsIndex].getColours()[i].equals("green")) {
        g.setColor(Color.GREEN);
      } else if (rows[rowsIndex].getColours()[i].equals("yellow")) {
        g.setColor(Color.YELLOW);
      } else if (rows[rowsIndex].getColours()[i].equals("grey")) {
        g.setColor(Color.GRAY);
      }
      g.drawRect((125 + (75 * i)), 110 + (75 * rowsIndex), 65, 65);
    }

    for (int j = 0; j < 5; j++) {
      g.setColor(Color.BLACK);
      g.drawString(rows[rowsIndex].getUserWordArray()[j], (135 + (75 * j)), (170 + (75 * rowsIndex)));
    }
  }


      



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
      
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }
}
