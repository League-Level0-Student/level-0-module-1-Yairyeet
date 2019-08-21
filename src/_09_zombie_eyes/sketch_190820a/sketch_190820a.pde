   void setup(){
    size(500, 500);
       PImage face = loadImage("manface.jpg");
        face.resize(500, 500);
image(face, 0, 0);

    }

    void draw(){
       fill(240,mouseX,mouseY);
ellipse(280, 150, 50, 50);
ellipse(210, 150, 50, 50);

    }
