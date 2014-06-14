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

    public static box newPyramid(box top) {
      box result;
      box b = top;
      top.setLeft(new box(275,150));
      top.getLeft().setParentR(top);
      top.setRight(new box(375,150));
      top.getRight().setParentL(top);
      b = b.getLeft();
      
      b.setLeft(new box(225,200));
      b.getLeft().setParentR(b);
      b.setRight(new box(325,200));
      b.getRight().setParentL(b);
      b.getRight().setParentR(top.getRight());
      box a = top.getRight();
      a.setLeft(b.getRight());
      a.setRight(new box(425,200));
      a.getRight().setParentL(a);
      box c = a.getRight();
      a = b.getLeft();
      b = b.getRight();
      
      a.setLeft(new box(175, 250));
      a.left.parentR = a;
      a.right = new box(275, 250);
      a.right.parentL = a;
      a.right.parentR = b;
      b.left = a.right;
      b.right = new box(375,250);
      b.right.parentL = b;
      b.right.parentR = c;
      c.left = b.right;
      c.right = new box(475,250);
      c.right.parentL = c;
      a = a.left;
      b = b.left;
      result = b;
      box d = c.right;
      c = c.left;
      
      a.left = new box(125,300);
      a.left.parentR = a;
      a.right = new box(225,300);
      a.right.parentL = a;
      a.right.parentR = b;
      b.left = a.right;
      b.right = new box(325,300);
      b.right.parentL = b;
      b.right.parentR = c;
      c.left = b.right;
      c.right = new box(425,300);
      c.right.parentL = c;
      c.right.parentR = d;
      d.left = c.right;
      d.right = new box(525,300);
      d.right.parentL = d;
      a = a.left;
      b = b.left;
      c = c.left;
      box e = d.right;
      d = d.left;
      
      a.left = new box(75,350);
      a.left.parentR = a;
      a.right = new box(175,350);
      a.right.parentL = a;
      a.right.parentR = b;
      b.left = a.right;
      b.right = new box(275,350);
      b.right.parentL = b;
      b.right.parentR = c;
      c.left = b.right;
      c.right = new box(375,350);
      c.right.parentL = c;
      c.right.parentR = d;
      d.left = c.right;
      d.right = new box(475,350);
      d.right.parentL = d;
      d.right.parentR = e;
      e.left = d.right;
      e.right = new box(575,350);
      e.right.parentL = e;
      a = a.left;
      b = b.left;
      c = c.left;
      d = d.left;
      box f = e.right;
      e = e.left;
      
      a.left = new box(25,400);
      a.left.parentR = a;
      a.right = new box(125,400);
      a.right.parentL = a;
      a.right.parentR = b;
      b.left = a.right;
      b.right = new box(225,400);
      b.right.parentL = b;
      b.right.parentR = c;
      c.left = b.right;
      c.right = new box(325,400);
      c.right.parentL = c;
      c.right.parentR = d;
      d.left = c.right;
      d.right = new box(425,400);
      d.right.parentL = d;
      d.right.parentR = e;
      e.left = d.right;
      e.right = new box(525,400);
      e.right.parentR = f;
      e.right.parentL = e;
      f.left = e.right;
      f.right = new box(625,400);
      f.right.parentL = f;
     
      return b;
    }
    
		
























}
