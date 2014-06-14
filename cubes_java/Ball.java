import java.util.*;
import java.io.*;

public class Coily extends Enemy {
  
  public box top;
  
  public Coily(box b, box t) {
    super(b);
    top = t;
  }
  
  public void move() {
    Random r = new Random();
    int n = r.nextInt(2);
    if (current.right == null || current.left == null) {
      current = top;
    }
    else if (n == 0) {
      dRight();
    }
    else {
      dLeft();
    }
  }
  
  
  
  
  
}  
