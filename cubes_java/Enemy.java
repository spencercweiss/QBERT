import java.util.*;
import java.io.*;

public class Enemy extends character {

	public Enemy(box b) {
		super(b);
                xLoc = b.xLoc+10;
                yLoc = b.yLoc-20;
	}

//	public Enemy() {}

	public void move() {
		Random r = new Random();
		box temp = current;
		int n = r.nextInt(4);
		if (n == 0)
			dRight();
		else if (n == 1)
			dLeft();
		else if (n == 2)
			uRight();
		else
			uLeft();
		if (temp == current)
			move();
	}

	public boolean check(QBERT q) {
		return q.getCurrent() == current;
	}

}



































