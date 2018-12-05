int X = 200;
int X1 =200;
int X2= 500;
void setup(){
  size(800, 800);

  
  
  }  

void draw(){
  background(#C1C1B4);
    for(int i= 0; i<25; i++){
      noFill();
    ellipse(X1, 300, i * 10, i * 10);
    }
    X1++;
     for(int i= 0; i<25; i++){
      noFill();
    ellipse(X2, 300, i * 10, i * 10);
    }
    X2--;
}