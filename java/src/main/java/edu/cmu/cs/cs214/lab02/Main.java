package edu.cmu.cs.cs214.lab02;

// import the specific shape class to calculate
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
// import shape to declare 
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        // declare as Shape
        Shape rectangle = new Rectangle(2, 3);

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
