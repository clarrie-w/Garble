public class Row {
    private int startingX = 125;
    private int y = 110;
    private int width;
    private int height;
    private String[] userWordArray = {"", "", "", "", ""};
    private String[] colours = {"", "", "", "", ""};
    private int row;

    public Row() {
        startingX = 125;
        y = 110;
        width = 65;
        height = 65;
        String[] userWordArray = {"", "", "", "", ""};
        String[] colours = {"", "", "", "", ""};
        row = 0;
    }

    public Row(int rowNumber) {
        startingX = 125;
        y = (rowNumber * 75) + 110;
        width = 65;
        height = 65;
        String[] userWordArray = {"", "", "", "", ""};
        String[] colours = {"", "", "", "", ""};
        row = rowNumber;
    }

    public Row(String[] word, String[] colourOfEachLetter, int rowNumber) {
        startingX = 125;
        y = (rowNumber * 75) + 110;
        width = 65;
        height = 65;
        userWordArray = word;
        String[] colours = colourOfEachLetter;
        row = rowNumber;
    }

    public void setY(int numGuess) {
        y = (numGuess * 75) + 110;
    }

    public int getY() {
        return y;
    }

    public void setUserWordArray(String[] userInput) {
        userWordArray = userInput;
    }

    public String[] getUserWordArray() {
        return userWordArray;
    }

    public void setColours(String[] coloursOfBoxes) {
        colours = coloursOfBoxes;
    }

    public String[] getColours() {
        return colours;
    }

    public void setRow(int rowIndexFrom0) {
        row = rowIndexFrom0;
    }

    public int getRow() {
        return row;
    }
}
