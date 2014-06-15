PImage imgl;
PImage imgr;
PImage coily;
PImage ball;
int x = 335;
int y = 80;
boolean pressed = false;
int t = 20;
int level = 1;

box top = new box(325,100);
box c = top;
//ArrayList<box> a = functions.createPyramid(top);
QBERT q = new QBERT(top);
box n = functions.newPyramid(top);
Enemy e = new Enemy(n);
Ball b1;
Changer ch;
ArrayList<Enemy> enemies = new ArrayList();

void setup(){
 enemies.add(e);
 makeStuff();
}

void makeStuff() {
   //enemies.add(e);
size(700, 700);
background(0);

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

image(coily,e.xLoc,e.yLoc);
image(coily,e.xLoc,e.yLoc);

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
  
if (ch != null)
  image(imgr,ch.xLoc,ch.yLoc);
}



void draw() {
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
      //setup();
    }


    if ((key == 's' || key == 'S') && pressed == true){

      q.dRight();
      pressed = false;
    //  setup();
    }


    if ((key == 'q' || key == 'Q') && pressed == true){

      q.uLeft();
      pressed = false;
     // setup();
    }


    if ((key == 'w' || key == 'W') && pressed == true){

      q.uRight();
      pressed = false;
     // setup();
    }
    q.addCurrent();
  }
  makeStuff();
   }
}

void keyReleased() {
  pressed = true;
 }

void winLevel() {
    if (level == 1) {
    updateScore(25, 1000);
    enemies.remove(0);
    e.current = null;
    e = new Enemy(n);
    enemies.add(e);
    b1 = new Ball(top.left.right, top);
    enemies.add(b1);
    q = new QBERT(top);
    }
    else if (level >= 2) {
      updateScore(25,1000);
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
    }
    level++;

}

void loseGame() {
  rect(0,0,200,100);
  text(":(",10,100);
}

