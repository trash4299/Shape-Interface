

public class Pentagon implements ShapeInterface
{
    double mySideLen;
    
    public Pentagon(double size)
    {
        mySideLen = size;
    }
    
    public double getPerimeter()
    {
        return mySideLen*5;
    }
    
    public double getArea()
    {
        return mySideLen*mySideLen*1.7204774;
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
