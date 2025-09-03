package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    // declare the variable shapes as Shapes
    // allows to work with any shape implementation in Main.java,
    // without changing Renderer.java code
    public Shape shape;
    
    // Renderer constructor, receive argument shape
    Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        // interface Shape method
        double area = shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
