import java.awt.Color; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel; 
  
public class Draw extends JPanel implements Runnable {
  Row[] rows = new Row[5];
  
  public Draw() {
    System.out.println("R?");
    Thread thread = new Thread(this);
    thread.start();
  }
  
  public void gameProcessing() {
    System.out.println("RUNNING");
    Game game = new Game();

    rows[0] = new Row(0);
    rows[1] = new Row(1);
    rows[2] = new Row(2);
    rows[3] = new Row(3);
    rows[4] = new Row(4);

    int rowsIndex = game.getNumGuesses();
    UserWord guess = new UserWord();
    GenerateWord generatedWord = new GenerateWord();

    while (rowsIndex < 5) {  
      System.out.println("ENTER WORD: ");
      guess.runScanner();
      rows[rowsIndex].setUserWordArray(guess.getUserInput());
      guess.setLetterColours(generatedWord.getWord(), rows[rowsIndex].getUserWordArray());
      rows[rowsIndex].setColours(guess.getLetterColours());
      repaint();
      rowsIndex++;
    }
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

    for(int r = 0; r < 5; r++){
      if(rows[r] == null) continue;
      for(int i = 0; i < 5; i++){
        System.out.print(rows[r].getUserWordArray()[i]);
      }
      System.out.println(r);
      for (int i = 0; i < 5; i++) {
        if (rows[r].getColours()[i].equals("green")) {
          g.setColor(Color.GREEN);
        } else if (rows[r].getColours()[i].equals("yellow")) {
          g.setColor(Color.YELLOW);
        } else if (rows[r].getColours()[i].equals("grey")) {
          g.setColor(Color.GRAY);
        }
        g.drawRect((125 + (75 * i)), 110 + (75 * r), 65, 65);
      }
      for (int j = 0; j < 5; j++) {
        g.setColor(Color.BLACK);
        g.drawString(rows[r].getUserWordArray()[j], (135 + (75 * j)), (170 + (75 * r)));
      }
    }
  }
  
  @Override
  public void run() {
    System.out.println("R!");
    while(true){
      gameProcessing();
    }
    
  }
}
