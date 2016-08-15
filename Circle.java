

public class Circle implements ShapeInterface
{
    double myRadiusLen;
    
    public Circle(double size)
    {
        myRadiusLen = size;
    }
    
    public double getPerimeter()
    {
        return myRadiusLen*2*Math.PI;
    }
    
    public double getArea()
    {
        return Math.pow(myRadiusLen,2)*Math.PI;
    }
    
    public double getSize()
    {
        return myRadiusLen;
    }
    
    public String context()
    {
        return "radius";
    }
}
