import java.lang.reflect.GenericSignatureFormatError;

/**
 * Class Rectangle
 * @author Brian Karimi, Katie Killian, Nicole Vadillo
 */
public class Rectangle
{

    int w, h;

    /**
     * Default Constructor for Class Rectangle
     */
    public Rectangle(){ }

    /**
     * Constructor for Class Rectangle
     * @param w is passed into instance's w variable
     * @param h is passed into this instance's h variable
     */
    public Rectangle(int w, int h){
        this.w = w;
        this.h = h;
    }

    /**
     * Calculates the Rectangle area
     * @return (w * h)
     * @throws NullPointerException generic exception thrown for testing
     * @throws NegativeArraySizeException generic exception thrown for testing
     * @throws GenericSignatureFormatError generic exception thrown for testing
     */
    public int getArea() throws NullPointerException, NegativeArraySizeException, GenericSignatureFormatError
    {
        return w * h;
    }
}
