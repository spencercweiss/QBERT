import java.util.*;
import java.io.*;

public class QBERT extends character {
  
        public ArrayList<box> a = new ArrayList();

	public QBERT(box b) {
		super(b);
		xLoc = 335;
		yLoc = 80;
	}

        public void addCurrent() {
          for (int i = 0; i<a.size(); i++) {
             if (a.get(i) == current)
               return;
          }
         a.add(current);
        }

}
