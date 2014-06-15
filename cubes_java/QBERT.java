import java.util.*;
import java.io.*;

public class QBERT extends character {
  
        public ArrayList<box> a = new ArrayList();

	public QBERT(box b) {
                super(b);
		xLoc = 335;
		yLoc = 80;
	}

        public void addCurrent(int l) {
          for (int i = 0; i<a.size(); i++) {
             if (a.get(i) == current) {
               if (l > 3) {
                 a.remove(i);}
               return;
             }
          }
         a.add(current);
        }
        
  //Override super move methods to incorporate lighting the boxes

  public void dRight() {
    if (current.getRight() != null) {
      current = current.getRight();
      xLoc = xLoc + 50;
      yLoc = yLoc + 50;
      
    }
    faceRight = true;
    getCurrent().lit();  
  }

  public void dLeft() {
    if (current.getLeft() != null) {
      current = current.getLeft();
      xLoc = xLoc - 50;
      yLoc = yLoc + 50;
    }
    faceRight = false;
    getCurrent().lit();
  }

  public void uRight() {
    if (current.getParentR() != null) {
      current = current.getParentR();
      xLoc = xLoc + 50;
      yLoc = yLoc - 50;
    }
    faceRight = true;
    getCurrent().lit();
  }

  public void uLeft() {
    if (current.getParentL() != null) {
      current = current.getParentL();
      xLoc = xLoc - 50;
      yLoc = yLoc - 50;
    }
    faceRight = false;
    getCurrent().lit();
  }  

}
