import java.util.*;
import java.io.*;

public class box {

	private box parentL, parentR, left, right;

	public int color;





		
	public void setRight(box b) {
		right = b;
		b.setParentL(this);
	}

	public void setLeft(box b) {
		left = b;
		b.setParentR(this);
	}

	public void setParentL(box b) {
		parentL = b;
	}

	public void setParentR(box b) {
		parentR = b;
	}

	public box getRight() {
		return right;
	}

	public box getLeft() {
		return left;
	}

	public box getParentL() {
		return parentL;
	}

	public box getParentR(box b) {
		return parentR;
	}



















}
