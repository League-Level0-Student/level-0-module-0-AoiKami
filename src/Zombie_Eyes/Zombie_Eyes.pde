void setup(){
  size(500, 500); 
}

void draw(){
  PImage face = loadImage("Hitler Trump.png");
image(face, 0, 0);
face.resize(400, 400);
fill(255, 0, 0);
ellipse(200, 285, 40, 20);
ellipse(340, 245, 40, 20);
fill(255, 0, 0);
  if(mousePressed){
    println(mouseX);
    println(mouseY);
      
  }
  fill(mouseX, 0, mouseY);
  ellipse(200, 285, 5, 5);
  ellipse(340, 245, 5, 5);
 
    


}
