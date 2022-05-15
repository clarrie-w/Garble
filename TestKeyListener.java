// import java.awt.Label;
// import java.awt.TextArea;
// import java.awt.event.KeyListener;
// import java.awt.event.KeyEvent;

// public class TestKeyListener extends Frame implements KeyListener {
//   Label word;
//   TextArea area;

//   public TestKeyListener() {
//     word = new Label();
//     word.setBounds(100, 100, 100, 100);
//     area = new TextArea();
//     area.setBounds(100, 100, 100, 100);
//     area.addKeyListener(this);
//     add(word);
//     add(area);
//     setSize(400, 400);
//     setLayout(null);
//     setVisible(true);
//   }

//   public void keyTyped (KeyEvent event) {
//     word.setText("");
//   }

//   public void keyPressed(KeyEvent event) {
//     word.setText("Key Pressed", event);
// }
//    public void keyReleased(KeyEvent event) {
//     printEventInfo("Key Released", event);
// }
