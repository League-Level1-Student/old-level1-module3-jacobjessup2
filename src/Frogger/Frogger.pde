
int frogX = 400;
int frogY = 500;
int jump = 70;
int carX;
int carY;

void draw(){
background(0,100,100);
//frog
fill(0,255,0);
ellipse(frogX,frogY,50,50);




 boundaries();
}

void setup(){
size(800,600);


}


void keyPressed(){
      if(key == CODED){
            if(keyCode == UP){
                  //Frog Y position goes up
                  frogY = frogY - jump;
            }
            else if(keyCode == DOWN){
                  //Frog Y position goes down 
                  frogY = frogY + jump;
            }
            else if(keyCode == RIGHT){
                  //Frog X position goes right
                  frogX = frogX + jump;
            }
            else if(keyCode == LEFT){
                  //Frog X position goes left
                  frogX = frogX - jump;
            }
      }
}



void boundaries(){
if(frogX>775){
frogX=775;
  }

else if (frogX < 25){
  frogX=25;
  }

else if (frogY > 575){
frogY=575;
  }

else if (frogY < 25){
frogY=25;
  }
}


void Car(){


}