public class ColouredSquares {
    private int[][] x = new int[6][5];
    private int[][] y = new int[6][5];
    private int width = 65;
    private int height = 65;
    private String[][] wordArray = new String[6][5];
    
    public void setSquareValues() {
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[0].length; col++) {
                x[row][col] = 125 + (75 * col);
            }
        }
  
        System.out.println("");
  
      for (int col = 0; col < y[0].length; col++) {
          for (int row = 0; row < y.length; row++) {
              y[row][col] = 110 + (75 * row);
          }
      }
    }

    
}
