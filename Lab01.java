/**
*
* Lisa hands off a book to Pete who places it in the book room
*
* @author Kent Collins  
* @version 11 November, 2014
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01 {

     public static void main(String[] args) {
    	 	Display.openWorld("maps/school.map");
    	 	Robot lisa = new Robot();
    	 	Robot pete = new Robot(4, 5, Display.SOUTH, 0);
    	 	lisa.move();
    	 	lisa.move();
    	 	lisa.turnLeft();
    	 	lisa.move();
    	 	lisa.turnLeft();
    	 	lisa.move();
    	 	lisa.pickBeeper();
    	 	lisa.turnLeft();
    	 	lisa.turnLeft();
    	 	lisa.move();
    	 	lisa.turnLeft();
    	 	lisa.turnLeft();
    	 	lisa.turnLeft();
    	 	lisa.move();
    	 	lisa.turnLeft();
    	 	lisa.move();
    	 	lisa.move();
    	 	lisa.move();
    	 	lisa.turnLeft();
    	 	lisa.move();
    	 	lisa.move();
    	 	lisa.move();
    	 	lisa.turnLeft();
    	 	lisa.move();
    	 	lisa.move();
    	 	lisa.turnLeft();
    	 	lisa.turnLeft();
    	 	lisa.turnLeft();
    	 	lisa.move();
    	 	lisa.putBeeper();
    	 	pete.pickBeeper();
    	 	pete.move();
    	 	pete.turnLeft();
    	 	pete.move();
    	 	pete.move();
    	 	pete.turnLeft();
    	 	pete.move();
    	 	pete.move();
    	 	pete.turnLeft();
    	 	pete.turnLeft();
    	 	pete.turnLeft();
    	 	pete.move();
    	 	pete.move();
    	 	pete.turnLeft();
    	 	pete.move();
    	 	pete.turnLeft();
    	 	pete.move();
    	 	pete.move();
    	 	pete.turnLeft();
    	 	pete.turnLeft();
    	 	pete.turnLeft();
    	 	pete.move();
    	 	pete.move();
    	 	pete.turnLeft();
    	 	pete.move();
    	 	pete.move();
    	 	pete.putBeeper();
    	 	pete.turnLeft();
    	 	pete.turnLeft();
    	 	pete.move();
     }
}
