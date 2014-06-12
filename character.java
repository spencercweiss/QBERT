import java.util.*;
import java.io.*;

public class character {
	public box current;
	public boolean faceRight;
	public int xLoc, yLoc;

	public character(box b) {
		current = b;
		faceRight = true;
	}

	public void dRight() {
		if (current.getRight() != null) {
			current = current.getRight();
			xLoc = xLoc + 50;
			yLoc = yLoc + 50;
		}
		faceRight = true;
			
	}

	public void dLeft() {
		if (current.getLeft() != null) {
			current = current.getLeft();
			xLoc = xLoc - 50;
			yLoc = yLoc + 50;
		}
		faceRight = false;
	}

	public void uRight() {
		if (current.getParentR() != null) {
			current = current.getParentR();
			xLoc = xLoc + 50;
			yLox = yLoc - 50;
		faceRight = true;
	}

	public void uLeft() {
		if (current.getParentL() != null) {
			current = current.getParentL();
			xLoc = xLoc - 50;
			yLoc = yLoc - 50;
		faceRight = false;
	}

	public box getCurrent() {
		return current;
	}






}









