public class Row {
    private int startingX = 125;
    private int y = 110;
    private int width;
    private int height;
    private String userWordPreArray;
    private String[] colours = {"", "", "", "", ""};
    private int row;

    public Row() {
        startingX = 125;
        y = 110;
        width = 65;
        height = 65;
        userWordPreArray = "";
        String[] colours = {"", "", "", "", ""};
        row = 0;
    }

    public Row(int rowNumber) {
        startingX = 125;
        y = (rowNumber * 75) + 110;
        width = 65;
        height = 65;
        userWordPreArray = "";
        String[] colours = {"", "", "", "", ""};
        row = rowNumber;
    }

    public Row(String word, String[] colourOfEachLetter, int rowNumber) {
        startingX = 125;
        y = (rowNumber * 75) + 110;
        width = 65;
        height = 65;
        userWordPreArray = word;
        String[] colours = colourOfEachLetter;
        row = rowNumber;
    }

    public void setY(int numGuess) {
        y = (numGuess * 75) + 110;
    }

    public int getY() {
        return y;
    }

    public void setUserWordPreArray(String userInput) {
        userWordPreArray = userInput;
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
