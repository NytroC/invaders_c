package edu.osucascades.cs361.alpha;

import processing.core.PApplet;

public class AlienBlue {

    PApplet p;
    String type;
    int x, y, damage, speed, pointValue, radius;

    public AlienBlue (PApplet pApplet, int xPos, int yPos) {
        p = pApplet;
        x = xPos;
        y = yPos;
        radius = p.width/30;
        damage = 0;

        // need some logic to determine point value here
        // pretty sure this will be linked to the Alien type
        // will ask Yong about this on Wednesday; believe a switch statement is best
    }

    public void moveLeft() {
        // logic to move left goes here
    }

    public void moveRight() {
        // logic to move right goes here
    }

    public void moveDown () {
        // logic to move down goes here
        // this should increase speed every time it triggers
    }

    public void dropBomb() {
        // logic to drop bomb goes here
    }

    public void draw() {
        p.fill(0, 0, 255);
        p.ellipse(x, y, radius, radius);
    }
}