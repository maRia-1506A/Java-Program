//VOLUME OF 2 BOXES WITH BOXVOLUME TEST APPLICATION
package PROBLEM_SOLVE;

public class Box {
    //instance variable
    Double height, width, depth;
    
    //constarctor
    Box(Double height, Double width, Double depth) {
        this.height= height;
        this.width= width;
        this.depth= depth;
    }

    //method
    void displayVol() {
        Double volume= height * width * depth;
        System.out.println("Volume of the box is: "+volume);
    }
}
