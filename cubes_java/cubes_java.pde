PImage imgl;
PImage imgr;
int x = 335;
int y = 80;
boolean pressed = false;

box top = new box(325,100);
box c = top;
//ArrayList<box> a = functions.createPyramid(top);
QBERT q = new QBERT(top);
int n = functions.newPyramid(top);

void setup(){
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
imgl = loadImage("bertleft.png");
imgr = loadImage("bertright.png");
if(q.faceRight){
image(imgr,q.xLoc,q.yLoc);
}else{
image(imgl,q.xLoc,q.yLoc);
}
}
void draw() {
  if (keyPressed){
    if (key == 'a' && pressed == true){
      q.dLeft();
      pressed = false;
      setup();
    }
    if (key == 's' && pressed == true){
      q.dRight();
      pressed = false;
      setup();
    }
    if (key == 'q' && pressed == true){
      q.uLeft();
      pressed = false;
      setup();
    }
    if (key == 'w' && pressed == true){
      q.uRight();
      pressed = false;
      setup();
    }
  }
}
void keyReleased() {
  pressed = true;
 }




