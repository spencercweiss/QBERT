import java.util.*;
import java.io.*;

public class character {
	public box current;
	public boolean faceRight;

	public character(box b) {
		current = b;
		faceRight = true;
	}

	public void dRight() {
		if (current.getRight() != null)
			current = current.getRight();
		faceRight = true;
			
	}

	public void dLeft() {
		if (current.getLeft() != null)
			current = current.getLeft();
		faceRight = false;
	}

	public void uRight() {
		if (current.getParentR() != null)
			current = current.getParentR();
		faceRight = true;
	}

	public void uLeft() {
		if (current.getParentL() != null)
			current = current.getParentL();
		faceRight = false;
	}

	public box getCurrent() {
		return current;
	}






}









