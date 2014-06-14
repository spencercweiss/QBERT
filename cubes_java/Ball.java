import java.util.*;
import java.io.*;

public class Ball extends Enemy {
  
  public box top;
  
  public Ball(box b, box t) {
    super(b);
    top = t;
  }
  
  public void move() {
    Random r = new Random();
    int n = r.nextInt(2);
    if (current.right == null || current.left == null) {
      current = top;
      xLoc = 335;
      yLoc = 80;
    }
    else if (n == 0) {
      dRight();
    }
    else {
      dLeft();
    }
  }
  
  
  
  
  
}  
