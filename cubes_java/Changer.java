import java.util.*;
import java.io.*;

public class Changer extends Enemy {
  
  public QBERT q;
  
  public Changer(box b, QBERT qbert) {
    super(b);
    q = qbert;
  }
  
  public void move() {
    super.move();
    for (int i = 0; i < q.a.size(); i++) {
      if (q.a.get(i) == current) {
        q.a.remove(i);
        return;
      }
    } 
  }
  
}
