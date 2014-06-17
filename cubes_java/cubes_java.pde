PImage imgl;
PImage imgr;
PImage coily;
PImage ball;
PImage evilR;
PImage evilL;
int x = 335;
int y = 80;
boolean pressed = false;
int t = 20;
int level = 0;
Score score = new Score(0, 3, 0, 0);

box top = new box(325,100);
box c = top;
//ArrayList<box> a = functions.createPyramid(top);
QBERT q = new QBERT(top);
box n = functions.newPyramid(top);
Enemy e = new Enemy(n);
Enemy e2, e3;
Ball b1,b2;
Changer ch, ch2;
ArrayList<Enemy> enemies = new ArrayList();

void setup(){
 enemies.add(e);
 makeStuff();
}

void makeStuff() {
   //enemies.add(e);
size(700, 700);
background(0);
if (level > 0) {

text(score.getScore() + q.a.size() * 25, 10,20);

//fill here
//.setFill() in box class
rect(325,100,50,20);
//r2
rect(275,150,50,20);
rect(375,150,50,20);
//r3
rect(325,200,50,20);

rect(225,200,50,20);
rect(425,200,50,20);
//r4
rect(275,250,50,20);
rect(375,250,50,20);
rect(175,250,50,20);
rect(475,250,50,20);
//r5
rect(325,300,50,20);
rect(225,300,50,20);
rect(125,300,50,20);
rect(425,300,50,20);
rect(525,300,50,20);
//r6
rect(275,350,50,20);
rect(375,350,50,20);
rect(175,350,50,20);
rect(75,350,50,20);
rect(475,350,50,20);
rect(575,350,50,20);
//r7
rect(325,400,50,20);
rect(225,400,50,20);
rect(125,400,50,20);
rect(25,400,50,20);
rect(425,400,50,20);
rect(525,400,50,20);
rect(625,400,50,20);
//QBERT facing directions based on where he's headed

for (box z : q.a) {
  fill(#74CFE5);
  rect(z.xLoc,z.yLoc,50,20);
}


imgl = loadImage("bertleft.png");
imgr = loadImage("bertright.png");
coily = loadImage("coily.png");
//ball
ball = loadImage("ball.png");
//changer
//changer = loadImage("changer.png")

evilR = loadImage("evilbertright.png");
evilL = loadImage("evilbertleft.png");

image(coily,e.xLoc,e.yLoc);

if (e2 != null)
  image(coily,e2.xLoc,e2.yLoc);
if (e3 != null)
  image(coily,e3.xLoc,e3.yLoc);

if(q.getCurrent().getLit() == true){
  fill(255);
  rect(q.getCurrent().xLoc, q.getCurrent().yLoc,50,20);
}

if(q.faceRight){
image(imgr,q.xLoc,q.yLoc);
}else{
image(imgl,q.xLoc,q.yLoc);
}


//image(coily,e.xLoc,e.yLoc);
//image(ball,e.xLoc,e.yLoc);
//>>>>>>> 1ff44cb6173190d0c0ace7cdfd76d6493de3f1dd


if (b1 != null)
  image(ball,b1.xLoc,b1.yLoc);
  
if (b2 != null)
  image(ball,b2.xLoc,b2.yLoc);
  
if (ch != null) {
  if (ch.faceRight) {
  image(evilR,ch.xLoc,ch.yLoc);}
  else {
    image(evilL,ch.xLoc,ch.yLoc);}
}

if (ch2 != null) {
  if (ch2.faceRight) {
  image(evilR,ch2.xLoc,ch2.yLoc);}
  else {
    image(evilL,ch2.xLoc,ch2.yLoc);}
}


}
}






void draw() {
  if (level > 0) {
  if (functions.checkEnemies(q,enemies))
    loseGame();
   else if (q.a.size() >= 28)
     winLevel();
   else {

  if (t == 20) {
    t = 0;
    for (Enemy enemy : enemies)
      enemy.move();
  }
  else {
    t++;
  }
  if (keyPressed){
    if ((key == 'a' || key == 'A') && pressed == true){
      q.dLeft();
      pressed = false;
      q.addCurrent(level);
      //setup();
    }


    if ((key == 's' || key == 'S') && pressed == true){

      q.dRight();
      pressed = false;
      q.addCurrent(level);
    //  setup();
    }


    if ((key == 'q' || key == 'Q') && pressed == true){

      q.uLeft();
      pressed = false;
      q.addCurrent(level);
     // setup();
    }


    if ((key == 'w' || key == 'W') && pressed == true){

      q.uRight();
      pressed = false;
      q.addCurrent(level);
     // setup();
    }
  }
   
  makeStuff();
   }
  }
  else {
  makeStuff();
  //rect(200,290,300,120);
  text("Player One: Press 's' to Start",260,450);
  text("Intructions:",310,200);
  text("Clear all of the Blocks",280,225);
  text("Use the q, w, a, and s keys to navigate",230, 250);
  if ((key == 's' || key == 'S') && pressed == true){
    level++;
    pressed = false;
  }
  
  }
}

void keyReleased() {
  pressed = true;
 }

void winLevel() {
    if (level == 1) {
    score.updateScore(q.a.size() * 25, 1);
    enemies.remove(0);
    e.current = null;
    e = new Enemy(n);
    enemies.add(e);
    b1 = new Ball(top.left.right, top);
    enemies.add(b1);
    q = new QBERT(top);
    }
    else if (level >= 5) {
    text("You Win!",10,40);
    text("Your score is:",10,60); 
    text((score.getScore() + (q.a.size() * 25)),105,60);
    }
    else if (level >= 2) {
      score.updateScore(q.a.size() * 25,2);
      q.current = null;
      q = new QBERT(top);
      enemies.remove(0);
      e.current = null;
      e = new Enemy(n);
      enemies.add(e);
      enemies.remove(0);
      b1.current = null;
      b1 = new Ball(top.left.right, top);
      enemies.add(b1);
      ch = new Changer(top.right.right.left, q);
      enemies.add(ch);
      if (level == 4) {
        ch2 = new Changer(top.left.left.right, q);
        b2 = new Ball(top.right.right, top);
        e3 = new Enemy(top.left.left);
        e2 = new Enemy(top.right.right.right.right.left);
        enemies.add(ch2);
        enemies.add(b2);
        enemies.add(e2);
        enemies.add(e3);
      }
        
    }
    level++;

}

void loseGame() {
  text("Game Over!",10,40);
  text("Your score was:",10,60); 
  text((score.getScore() + (q.a.size() * 25)),105,60);
}

