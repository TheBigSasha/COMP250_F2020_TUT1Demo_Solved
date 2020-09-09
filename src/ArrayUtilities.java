public interface ArrayUtilities {
    /*
    This method goes through the elements of a 2d array and finds the longest element!
     */
     static int getLongestElement(Object[][] input) {
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
