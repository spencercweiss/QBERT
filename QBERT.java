import java.util.*;
import java.io.*;

public class QBERT {
	private box current;

	public QBERT(box b) {
		current = b;
	}

	public void dRight() {
		if (current.getRight() != null)
			current = current.getRight();
	}

	public void dLeft() {
		if (current.getLeft() != null)
			current = current.getLeft();
	}

	public void uRight() {
		if (current.getParentR() != null)
			current = current.getParentR();
	}

	public void uLeft() {
		if (current.getParentL() != null)
			current = current.getParentL();
	}
