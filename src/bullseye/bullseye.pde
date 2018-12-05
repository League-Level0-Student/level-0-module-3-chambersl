void setup(){
  size(600, 600);

  
  
  }  

void draw(){
    for(int i= 0; i<10; i++){
      noFill();
    ellipse(300, 300, i * 10, i * 10);
    }
}