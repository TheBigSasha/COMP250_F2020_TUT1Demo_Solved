package TutorialOne;

import java.awt.*;

/**
 * This class walks the user through iteration through arrays with for loops!
 */
public class ArrayDrawer extends Canvas {
    private Color[][] dataset;

    /*
    Constructor for array drawer. It sets dataset to be what is passed from the declaration and it uses it to instantiate the field. It also calls the constructor of Canvas.
     */
    public ArrayDrawer(Color[][] input) {
        super();
        dataset = input;
    }

    /*
        This method draws stuff.

        Here, our goal is to draw the Colors from dataset, a 2d array of Color objects.

        We must use for loops to iterate through the array and draw the image.
     */
    public void paint(Graphics g) {

        //TODO: Make a loop which iterates through our array and draws the colour at that element in the right
        // place. This must do a few things: Calculate the size of each color and all.

        System.out.println("My window is " + getWidth() + " pixels wide and " + getHeight() + " pixels tall. Could this be important?");

        //============ DEFAULT SOLUTION : CHANGE CODE BELOW ==============

        g.setColor(dataset[0][0]);                          //Read the array at an index to set the colour
        g.fillRect(0,0,10,10);            //Draw a rectangle

        //================================================================

    }
}