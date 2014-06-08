import javax.swing.*;
import java.awt.event.*;

public class GameWindow extends JFrame {

	public GameWindow() {
		setTitle("Empty Window");
		setSize(600,600);
		setLocation(200,200);
		setBackground(Color.BLACK);
	}

	public static void main(String[] args) {
		JFrame f = new GameWindow();
		f.show();
	}



}
