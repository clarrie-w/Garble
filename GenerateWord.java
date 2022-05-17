/**
* GenerateWord.java
* @author Garble Team
* @since 5/10/2022
* generates random word from a word bank 
*/

class GenerateWord{
  private String[] words = {"PARTY", "FOODS", "HELLO", "WORLD", "WHICH", "THERE", "THEIR", "ABOUT", "WOULD", "THESE", "OTHER", "WORDS", "COULD", "WRITE", "FIRST", "WATER", "AFTER", "WHERE", "RIGHT", "THINK", "THREE", "YEARS", "PLACE", "SOUND", "GREAT", "AGAIN", "STILL", "EVERY", "SMALL", "FOUND", "THOSE", "NEVER", "UNDER", "MIGHT", "WHILE", "HOUSE", "BELOW", "ASKED", "GOING", "LARGE", "UNTIL", "ALONG", "SHALL", "BEING", "OFTEN", "EARTH", "BEGAN", "SINCE", "STUDY", "NIGHT", "LIGHT", "ABOVE", "PAPER", "PARTS", "YOUNG", "STORY", "POINT", "TIMES", "HEARD", "WHOLE", "WHITE", "GIVEN", "MEANS", "MUSIC", "MILES", "THING", "TODAY", "LATER", "USING", "MONEY", "LINES", "ORDER", "GROUP", "AMONG", "LEARN", "KNOWN", "SPACE", "TABLE", "EARLY", "TREES", "SHORT", "HANDS", "STATE", "BLACK", "SHOWN", "STOOD", "FRONT", "VOICE", "KINDS", "MAKES", "COMES", "CLOSE", "POWER", "LIVED", "VOWEL", "TAKEN", "BUILT", "HEART", "READY"}; // word bank (100 words)
  private int randomWordIndex = (int) (Math.random() * words.length - 1); // index of random word from word bank
  private String randomWord = words[randomWordIndex];
  private String[] randomWordArray;

  public String[] getWord()
  {
    for (int i = 0; i < 5; i++) {
      randomWordArray[i] = randomWord.substring(i, i+1);
    }
    return randomWordArray; 
  }

}