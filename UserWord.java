
/**
* UserWord.java
* @author Garble Team
* @since May 10th 2022
* This class takes the input of the user to store their guess.
*/
import java.util.Scanner;

public class UserWord {
  private String[] colours = {"grey", "grey", "grey", "grey", "grey"};
  private Scanner scanner = new Scanner(System.in);
  private String userInput;

  public void runScanner() {
    userInput = scanner.nextLine().toUpperCase();
  }

  public String[] getUserInput() {
    String[] userWordArray = new String[5];    
    for (int i = 0; i < 5; i++) {
      if (i == 4) {
        userWordArray[i] = userInput.substring(i);
      } else if (i != 4) {
        userWordArray[i] = userInput.substring(i, i+1);
      }
    }
    return userWordArray;
  }

  public String firstFive()
  {
    if (userInput.length()>5)
    {
      userInput = userInput.substring(0,5); // will only recognize input as first 5 letters of guess 
    }
    return userInput; 
  }
  
  /**
  * Assigns the correct color to each letter based
  * on if they are in the word or the correct position
  *
  * @param string array of the user input
  * @param string array of the randomly generated word
  */
  public void setLetterColours(String[] generatedWord, String[] userGuess) {
    // loop to check if letter is in correct spot
    for (int i = 0; i < 5; i++) {
      if (userGuess[i].equals(generatedWord[i])) {
        colours[i] = "green"; // set that letter in the color array to be green
        generatedWord[i] = "-"; // replaces that letter from word
      } 
    }
    
    // loop to check if letter is in word but wrong position
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        // checks one letter from guess to all letters in word and makes sure the color isn't green
        if ((userGuess[i].equals(generatedWord[j])) && colours[i] != "green") {
          colours[i] = "yellow";
          generatedWord[j] = "-";
        }
      }
    }
  }

  public String[] getLetterColours() {
    for (int i = 0; i < 5; i++) {
      System.out.println(colours[i]);
    }
    return colours.clone();
  }
}
