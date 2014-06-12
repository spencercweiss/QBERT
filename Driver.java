import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {
		box top = new box();
		ArrayList<box> a = functions.createPyramid(top);
		int level = 1;
		QBERT q = new QBERT(top);
//		System.out.println(a.size());
		Enemy e = new Enemy(functions.placeEnemy(a));
		ArrayList<Enemy> enemies = new ArrayList();
		enemies.add(e);
		 
		
		




























	}
}
