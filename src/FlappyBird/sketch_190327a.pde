
int birdY = 250;
int birdX = 100;
int birdYVelocity = 50;
int gravity = 1;
int pipeX = 400;
void setup(){
size(500,500);
}


void draw(){
//background and bird
  background(0255,255,255);
fill(255,255,50);
stroke(0,0,0);
ellipse(birdX,birdY,50,50);
birdY = birdY + gravity;

//pipe
fill(0,255,0);
rect(pipeX,0,50,200);
pipeX = pipeX-1;
}

void mousePressed(){
birdY = birdY-birdYVelocity;
}