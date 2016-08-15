

public class Square implements ShapeInterface
{
    double mySideLen;
    
    public Square(double size)
    {
        mySideLen = size;
    }
    
    public double getPerimeter()
    {
        return mySideLen*4;
    }
    
    public double getArea()
    {
        return mySideLen*mySideLen;
    }
    
    public double getSize()
    {
        return mySideLen;
    }
    
    public String context()
    {
        return "side";
    }
}
