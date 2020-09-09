import java.awt.*;

public class ArrayDrawer extends Canvas {
    private Color[][] dataset;

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
        /*
            //====================================== Poor solution =====================================
            for (int i = 0; i < dataset.length; i++) {
                for (int j = 0; j < dataset[i].length; j++) {                       //Nested for loop to iterate through the array at this height
                    g.setColor(dataset[i][j]);                                      //Set the color to the one a this index of the color array
                    g.fillRect(j, i, 1,
                            1);                                                     //Draw the rectangle.
                }
            }
            //===============================================================================================
         */



            //====================================== Slightly better solution =====================================
            for (int i = 0; i < dataset.length; i++) {
                for (int j = 0; j < dataset[i].length; j++) {                       //Nested for loop to iterate through the array at this height
                    g.setColor(dataset[i][j]);                                      //Set the color to the one a this index of the color array
                    g.fillRect(j * 10, i * 10, 10,                       //Multiply everything in here by 10!
                            10);                                              //Draw the rectangle.
                }
            }
            //===============================================================================================

/*
        //====================================== SOLUTION LOOP ==========================================
        int pixelsPerItemVer = getHeight() / dataset.length;
        for (int i = 0; i < dataset.length; i++) {                              //We cannot use a foreach loop here because we must use the numbers i and j for scaling
            int lengthAtThisIndex = dataset[i].length;                          //Calculate the length of the array at this index to size the color accordingly
            int pixelsPerItemHorAtIndex = getWidth() / lengthAtThisIndex;       //Calculating how many pixels each color will take up
            for (int j = 0; j < dataset[i].length; j++) {                       //Nested for loop to iterate through the array at this height
                g.setColor(dataset[i][j]);                                      //Set the color to the one a this index of the color array
                g.fillRect(j * pixelsPerItemHorAtIndex, i * pixelsPerItemVer, getWidth() / lengthAtThisIndex,
                        getHeight() / dataset.length);                    //Draw the rectangle. We multiply the index by the pixels per item to get the position.
            }
        }
        //==============================================================================================
        */
    }


    /*
     * This method is used to calculate how many pixels each colour should take up. So if we have a window of
     * width 100 and a longest horizontal array of 10, it will return 10.
     * <p>
     * Notice how we don't care what the array is of
     */
    private int getLongestElement(Object[][] input) {
        //TODO: This method must iterate through the dataset array and return the longest array!


        //---------------------- Solution code 1 ----------------------

/*
            int largest = 0;
            for(int i = 0; i < input.length; i++){
                if(input[i].length > largest){
                    largest = input[i].length;
                }
            }
            return largest;
*/

        //--------------------- End of Solution 1 -----------------------


        //---------------------- Solution code 2 ----------------------
        int largest = 0;
        for (Object[] objects : input) {
            if (objects.length > largest) {
                largest = objects.length;
            }
        }
        return largest;
        //--------------------- End of Solution 2 -----------------------

    }

}