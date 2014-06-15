import java.util.*;
import java.io.*;

public class Changer extends Enemy {
  
  public QBERT q;
  public boolean alive;
  public int t;
  public box placeHolder;
  
  public Changer(box b, QBERT qbert) {
    super(b);
    q = qbert;
    alive = true;
    t = 0;
    placeHolder = current;
    
  }
  
  public void move() {
    if (alive) {
    super.move();
    for (int i = 0; i < q.a.size(); i++) {
      if (q.a.get(i) == current) {
        q.a.remove(i);
        return;
      }
    } 
    }
    else {
     if (t == 10) {
       alive = true;
       current = placeHolder;
       xLoc = current.xLoc+10;
       yLoc = current.yLoc-20;
     }
     else {
       t++;
     }
  }
  }
  
  public boolean check(QBERT q) {
    if (super.check(q)) {
      xLoc = 800;
      yLoc = 800;
      alive = false;
      t = 0;
      placeHolder = current;
      current = null;
    }
    return false;
  }
  
}
