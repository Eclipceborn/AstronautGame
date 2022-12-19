import java.awt.*;

/**
 * Created by chales on 11/6/2017.
 */
public class Astronaut {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;               //name of the hero
    public int xpos;                  //the x position
    public int ypos;                  //the y position
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public int width;                 //the width of the hero image
    public int height;                //the height of the hero image
    public boolean isAlive,isCrashingAstro;           //a boolean to denote if the hero is alive or dead

    public boolean isAliveSun,isCrashingSun;           //a boolean to denote if the hero is alive or dead
    public Rectangle rec;




        
    //This is a constructor that takes 3 parameters.
    // This allows us to specify the hero's name and position when we build it.
    public Astronaut(String pName, int pXpos, int pYpos) { // Astronaut constructor
        name = pName;
        xpos = pXpos;
        ypos = pYpos;
        xpos = (int)(Math.random()*400+100);
        ypos = pYpos;
        ypos = (int)(Math.random()*150+50);
        dx = 2;
        dy = 2;
        width = 60;
        height = 60;
        isAlive = true;
        rec= new Rectangle(xpos,ypos,width,height);

    } // end Astronaut constructor

    //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
    public void move() { // move
        xpos = xpos + dx;
        ypos = ypos + dy;
        rec= new Rectangle(xpos,ypos,width,height);

    }// end move


    public void bounce() {
        xpos = xpos + dx;
        ypos = ypos + dy;

        // if alien hits the right side, reverse dx direction
        if (xpos >= 950) {
            xpos = 949;
            dx = -dx;
        }
        if (ypos >= 660) {
            ypos = 659;
            dy = -1 * dy;
        }
        if (xpos <= 0) {
            xpos = 0;
            dx = -dx;
        }
        if (ypos <= 0) {
            ypos = 0;
            dy = -1 * dy;

        }
        rec= new Rectangle(xpos,ypos,width,height);

    }




    public void wrap() {
        xpos = xpos + dx;
        ypos = ypos + dy;

        if (xpos >= 1000) {// right wall
            xpos = -width;
        }
        if (xpos <= -width) {// left wall
            xpos = 1000;
        }
        if (ypos <= -height) {// top wall
            ypos = 600;
        }
        if (ypos >= 600) {// right wall
            ypos = -height;
        }
        rec= new Rectangle(xpos,ypos,width,height);

    }

}





