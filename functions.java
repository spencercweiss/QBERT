import java.util.*;
import java.io.*;

public class functions {


	public static ArrayList<box> createPyramid(box b) {
	/*	if (n >= 7)
			return;
		else if (b.getParentL() = null && b.getParentR == null) {
			b.setRight(new box());
			b.setLeft(new box());
			b.getRight().setParentL(b);
			b.getLeft().setParentR(b);
			createPyramid(b.getRight(), n+1);
			createPyramid(b.getLeft(), n+1);
		}
		else if (b.getParentL() == null) {
			if (b.getParentR().getParentL() != null && b.getParentR().getParentL().getLeft() != null) {
				b.setParentL(b.getParentR().getParentL().getLeft());
				b.getParentL.setRight(b);



	*/
	ArrayList<box> a = new ArrayList();
	box c = b;
	box h = b;
	int n = 6;
	int i;
	a.add(c);
	while (n > 0) {
		c = h;
		i = 0;
		while (i < n) {
			c.setLeft(new box(c.xLoc - 50, c.yLoc + 50));
			c.getLeft().setParentR(c);
			if (c.getParentL() != null) {
				c.getParentL().getLeft().setRight(c.getLeft());
				c.getLeft().setParentL(c.getParentL().getRight());
			}
			c = c.getLeft();
			i++;
			a.add(c);
		}
		h.setRight(new box(h.xLoc + 50, h.yLoc + 50));
		h.getRight().setParentR(h);
		h = h.getRight();
		n--;
		a.add(h);
	}
	return a;
	}
			
	public static box placeEnemy(ArrayList<box> a) {
		Random r = new Random();
		int temp = r.nextInt(27);
		return a.get(temp);
	}
		
























}
