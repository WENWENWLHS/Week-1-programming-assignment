public class Polygon {

    //instance variables
    private int sides;
    private int sideLength;
    private String shapeType;

    //default constructor
    public Polygon(){
        sides = 3;
        sideLength = 1;
        shapeType = "";
    }

    //overloaded constructor

    /**
     * Creates a polygon shape object with sides and side length
     *
     * @param s sides of polygon
     * @param sL side length of polygon
     * @param shape shape of the polygon
     */
    public Polygon(int s, int sL, String shape){
        sides = s;
        sideLength = sL;
        shapeType = shape;

        //validation check
        if(s < 3 ){

            System.out.println("Not a valid number of sides");
        }
        else if(sL <= 0){
            System.out.println("Not a valid side length");
        }
        else{
            System.out.println
                    ("This is the output with " + s + " sides, side length of " + sL + " and a name of " + shape);
        }
    }

    //accessors

    /**
     *
     * @return the sides of the polygon
     */
    public int getSides() {
        return sides;
    }

    /**
     *
     * @return the side length of the polygon
     */
    public int getSideLength() {
        return sideLength;
    }

    /**
     *
     * @return the shape of the polygon
     */
    public String getShapeType() {
        return shapeType;
    }

}
