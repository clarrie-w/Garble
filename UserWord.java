
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

  public String[] getUserInput() {

    String[] userWordArray = new String[5];

    userInput = scanner.nextLine().toUpperCase();
    
    for (int i = 0; i < 5; i++) {
      userWordArray[i] = userInput.substring(i, i+1);
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

  public void setLetterColours(String[] generatedWord, String[] userGuess) {
    for (int i = 0; i < 6; i++) {
      if (userGuess[i].equals(generatedWord[i])) {
        colours[i] = "green";
      } 

      for (int j = 0; j < 6; j++) {
        if ((userGuess[i].equals(generatedWord[j])) && colours[i] != "green") {
          colours[i] = "yellow";
        }
      }
    }
  }

  public String[] getLetterColours() {
    return colours;
  }
}
