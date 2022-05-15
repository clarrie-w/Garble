import java.awt.Toolkit; 
import java.awt.Dimension;
import java.awt.Container;
import java.awt.BorderLayout; 
import javax.swing.JFrame;

class Main extends JFrame{

  //Instance variables for window
  private static Main window;
  private static Draw draw;
  private static final int WIDTH = 600;
  private static final int HEIGHT = 600;

  
  public Main(){
    draw = new Draw();
    addKeyListener(draw);
  }
  
  public static void main(String[] args) {
    
    window = new Main();
    Container ctn = window.getContentPane();
    ctn.setLayout(new BorderLayout()); 
    ctn.add(Main.draw,BorderLayout.CENTER);
      
    window.pack();
    window.setSize(WIDTH, HEIGHT);

    // Centers the window
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2); 

    // Creates parts of the window and makes it visible 
    window.setTitle("GARBLE") ; 
    window.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    window.setResizable(true);
    window.setVisible(true);
    window.setAlwaysOnTop(true);
    window.setFocusable(true);
    }
}
/*
    // game code
    UserWord userWord = new UserWord();
    GenerateWords generateWords = new GenerateWords();
    String word = generateWords.getWord();
    String input = "";
    
    for (int count = 0; count < 6; count++) { // user inputted words (guesses)
      input = userWord.getUserInput().toUpperCase();
      if (word.equals(input)) {
        System.out.println("You win");
        break; 
      } else {
        System.out.println("Try again");
      }
    }
    System.out.println("You lose");
  }
}*/
