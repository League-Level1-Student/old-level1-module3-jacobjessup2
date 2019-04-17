
int birdY = 250;
int birdX = 100;
int birdYVelocity = 70;
int gravity = 2;
int pipeWidth = 50;
int pipeMovement = 2;
int upperPipeX = 400;
int lowerPipeX = 400;
int upperPipeHeight = (int) random (100, 400);
int lowerPipeHeight = upperPipeHeight+(int) random (125,200);
int score;
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

//upper pipe
fill(0,255,0);
rect(upperPipeX,0,50,upperPipeHeight);
upperPipeX = upperPipeX-pipeMovement;
teleportUpperPipe();

//lower pipe
fill(0,255,0);
rect(lowerPipeX,lowerPipeHeight,50,2500);
lowerPipeX = lowerPipeX-pipeMovement;
teleportLowerPipe();

if(intersectsPipes() == true){
gravity = 0;
birdYVelocity = 0;
pipeMovement = 0;
fill(0,0,255);
text("Game Over", 250,250);
  }
  
  //Score
  fill(0,0,255);
  text(score, 450,50);
  if(upperPipeX == 100){
  score++;
  }
  
}

void teleportUpperPipe(){
  if(upperPipeX == -50){
  upperPipeX = 500;
  upperPipeHeight = (int) random (100, 400);
  }
}
void teleportLowerPipe(){
  if(lowerPipeX == -50){
  lowerPipeX = 500;
  lowerPipeHeight = upperPipeHeight+(int) random (125,200);
  }
  
}

boolean intersectsPipes() {
     if (birdY < upperPipeHeight && birdX > upperPipeX && birdX < (upperPipeX+pipeWidth)){
          return true; }
     else if (birdY>lowerPipeHeight && birdX > lowerPipeX && birdX < (lowerPipeX+pipeWidth)) {
          return true; }
     else if (birdY > 500){ 
       return true;}     
     else {
       return false; }
} 


void mousePressed(){
birdY = birdY-birdYVelocity;
}