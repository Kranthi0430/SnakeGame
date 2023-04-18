import javax.swing.JFrame; //Parent Class

public class Frame extends JFrame{ //child class
    Frame(){ //constructure name as the class only
        this.setTitle("SnakeGame");
        this.add(new Panel());
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
    }
}
