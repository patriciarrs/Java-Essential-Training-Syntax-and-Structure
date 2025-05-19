package objects;

/*
This class is a representation or a blueprint of a rectangle
(a generalized shell That we can later make more specific in other classes).

This class does not have a main method.
We're not interested in executing any of the methods inside of this class itself.
*/
public class Rectangle {
    /*
    Classes should provide ENCAPSULATION.
    ENCAPSULATION is one of the key principles of object-oriented programming.
    It specifies that the data of a class (which are fields) should be private
    and the behavior of the class (which are the methods) can be public to other classes to use.

    To encapsulate our class, we add private access modifiers to the fields
    and public access modifiers to the methods we'd like to expose.

    ACCESS MODIFIERS:
    - public;
    - protected: only other classes within the same package can access it (similar to having no access modifier at all);
    - private.
    */
    private double length;
    private double width;

    /* CONSTRUCTORS */
    /* Used to initialize an object or set up its state in some way.
    All objects have a constructor.

    There's no return type because constructors are not a method.
    The constructor's name must be the exact same name as the class.

    We can have as many constructors as we like (what differs is the parameters that they accept).
    */

    // DEFAULT CONSTRUCTOR
    /*
    Even if we don't declare it explicitly, it still exists by default under the covers - is always defined implicitly.

    Does not have a parameter list.
    If someone wanted to create a rectangle object, and not set the length or the width yet, they could use this constructor.
    The default constructor is typically used to assign default values to fields.
    */
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // CONSTRUCTOR to create a rectangle object with a known length and width.
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

    /* Getters and setters */

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
