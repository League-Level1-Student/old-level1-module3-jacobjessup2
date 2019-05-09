Car car1 = new Car(50, 400, 8, 75);
Car car2 = new Car(500, 550, 10, 75);
Car car3 = new Car(250, 50, 20, 75);
int frogX = 400;
int frogY = 500;
int jump = 70;


void draw(){
background(0,100,100);
//frog
fill(0,255,0);
ellipse(frogX,frogY,25,25);

car1.display();
car1.moveLeft();



car2.display();
car2.moveLeft();

car3.display();
car3.moveRight();


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

//car stuff
class Car{
int carY;
int carX;
int carSpeed;
int carSize;



boolean intersects(Car car) {
      if ((frogY > car.getY() && frogY < car.getY()+50) && (frogX > car.getX() && frogX < car.getX()+car.getSize()))
      {
             return true;
      }
      else 
      {
             return false;
      }
}


Car(int carY, int carX, int carSpeed, int carSize){
  this.carY = carY;
  this.carX = carX;
  this.carSpeed = carSpeed;
  this.carSize = carSize;
  }

void display() {
fill(255,0,0);
rect(carX, carY, carSize, 50);
  }
  
  
int getX(){
return carX;
}

int getY(){
return carY;
}

int getSize(){
return carSize;
}



void moveLeft(){
carX = carX - carSpeed;
if(carX<-50){
  carX = 900;
    }
  }



void moveRight(){
carX = carX + carSpeed;
if(carX>850){
  carX = -100;
    }
  }

}