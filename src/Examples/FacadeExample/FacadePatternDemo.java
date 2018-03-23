package Examples.FacadeExample;

//FacadePatternDemo, our demo class, will use ShapeMaker class to show the results.


//Facade Design Pattern in essence hides all the complex bits of
// creating and logic of managing classes behind a service class
// in this case being the ShapeMaker

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}